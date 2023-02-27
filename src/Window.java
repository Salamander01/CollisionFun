import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

abstract class Window extends JPanel {

    protected final JFrame frame;

    // Constructors
    protected Window(String name, boolean maxSize, Dimension size, boolean resizeable, int fps) { // TODO I don't like how I'm managing maxSize and size. Change latter into multiple constructors.

        this.frame = new JFrame(name);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if (maxSize) {
            this.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        } else {
            this.frame.setSize(size);
        }

        this.frame.setResizable(resizeable);
        this.frame.setContentPane(this);

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(() -> {
            this.update();
            this.repaint();
        }, 1000, 1000 / fps, TimeUnit.MILLISECONDS);
    }

    // Protected Methods
    abstract protected void update();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}

import java.awt.*;
import java.awt.Point;
import java.util.ArrayList;

public class CollisionWindow extends Window {

    private ArrayList<Particle> particles;

    protected CollisionWindow(String name, boolean maxSize, Dimension size, boolean resizeable, int fps) {
        super(name, maxSize, size, resizeable, fps);

        this.particles = new ArrayList<>();

        this.particles.add(new Particle(10, new Location(50, 100) , new Vector(0, 10),new Vector(1, -1)));

        this.setBackground(Color.BLACK);
        this.frame.setVisible(true);
    }

    @Override
    protected void updateWindow() {
        this.particles.forEach(particle -> {
//            repaint((int) particle.position.x() + particle.radius, (int) particle.position.y() + particle.radius, particle.diameter, particle.diameter);
            particle.update(this.getWidth(), this.getHeight());
//            repaint((int) particle.position.x() + particle.radius, (int) particle.position.y() + particle.radius, particle.diameter, particle.diameter);
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(50, 50, 5, 100);
        for (Particle particle : this.particles) {
//            g.fillOval((int) (ball.getX() - ball.getRadius()), (int) (ball.getY() - ball.getRadius()), (int) ball.getDiameter(), (int) ball.getDiameter());

            g.fillOval((int) particle.position.x() - particle.radius, (int) particle.position.y() - particle.radius, particle.diameter, particle.diameter);
        }
    }
}

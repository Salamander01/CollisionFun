import java.awt.*;
import java.awt.Point;
import java.util.ArrayList;

public class CollisionWindow extends Window {

    private ArrayList<Particle> particles;

    protected CollisionWindow(String name, boolean maxSize, Dimension size, boolean resizeable, int fps) {
        super(name, maxSize, size, resizeable, fps);

        this.particles = new ArrayList<>();

        this.particles.add(new Particle(10, new Location(500, 10) , new Vector(0, 1.0/6),new Vector(0, 0)));

        this.setBackground(Color.BLACK);
        this.frame.setVisible(true);
    }

    @Override
    protected void updateWindow() {
        this.particles.forEach(Particle::update);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Particle particle : this.particles) {
            g.setColor(Color.WHITE);
            g.fillOval((int) particle.position.x() + particle.radius, (int) particle.position.y() + particle.radius, particle.diameter, particle.diameter);
        }
    }
}

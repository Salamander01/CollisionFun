import java.awt.*;
import java.awt.Point;
import java.util.ArrayList;

public class CollisionWindow extends Window {

    private ArrayList<Particle> particles;

    protected CollisionWindow(String name, boolean maxSize, Dimension size, boolean resizeable, int fps) {
        super(name, maxSize, size, resizeable, fps);

        this.particles = new ArrayList<>();
    }

    @Override
    protected void update() {
        this.particles.forEach(Particle::update);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Particle particle : this.particles) {
            g.fillOval(particle.position.x() + particle.radius, particle.position.y() + particle.radius, particle.diameter, particle.diameter);
        }
    }
}

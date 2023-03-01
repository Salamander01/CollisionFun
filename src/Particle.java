public class Particle {
    protected int radius;
    protected int diameter;
    protected Location position;
    protected Vector acceleration;
    protected Vector velocity;

    protected Particle(int radius, Location startPosition, Vector startingAcceleration, Vector velocity) {
        this.radius = radius;
        this.diameter = radius * 2;
        this.position = startPosition;
        this.acceleration = startingAcceleration;
        this.velocity = velocity;
    }

    protected void update() {
        this.position.add(velocity);
        this.velocity = this.velocity.add(acceleration);
    }

}

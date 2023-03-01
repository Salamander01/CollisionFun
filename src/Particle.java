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

    protected void update(int width, int height) {
        if (this.position.x() > width || this.position.x() < 0) {
            this.velocity = new Vector(-this.velocity.getComponentX(), this.velocity.getComponentY());
        }
        if (this.position.y() > height || this.position.y() < 0) {
            this.velocity = new Vector(this.velocity.getComponentX(), -this.velocity.getComponentY());
        }
        this.position.add(velocity);
        this.velocity.add(acceleration);
    }

}

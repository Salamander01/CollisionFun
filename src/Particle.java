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
            this.velocity = new Vector(-this.velocity.getComponentX() + (this.velocity.getComponentX() * .1), this.velocity.getComponentY());
        }
        if (this.position.y() > height || this.position.y() < 0) {
            this.velocity = new Vector(this.velocity.getComponentX(), -this.velocity.getComponentY() + (this.velocity.getComponentY() * .1));
        }

        this.position = new Location(this.position.x() + 5 * (this.velocity.getComponentX() / 12), this.position.y() + 5 * (this.velocity.getComponentY() / 12));
        this.velocity = new Vector(this.velocity.getComponentX() + (this.acceleration.getComponentX() / 2400), this.velocity.getComponentY() + (this.acceleration.getComponentY() / 2400));

//        this.position.add(velocity);
//        this.velocity.add(acceleration);
    }

}

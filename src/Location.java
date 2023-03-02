public class Location {

    private double x;
    private double y;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    protected double x() {
        return this.x;
    }

    protected double y() {
        return this.y;
    }

    public double distanceTo(Location location) {
        return Math.sqrt((this.x + location.x) * 2 + (this.y + location.y) * 2);
    }

    public void add(Vector vector) {
        this.x += vector.getComponentX();
        this.y += vector.getComponentY();
    }
}

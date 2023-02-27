public class Vector {

    private double componentX;
    private double componentY;

    public Vector(double componentX, double componentY) {
        this.componentX = componentX;
        this.componentY = componentY;
    }

    public Vector add(Vector vector) {
        return new Vector(this.componentX + vector.componentX, this.componentY + vector.componentY);
    }

    public double getComponentX() {
        return componentX;
    }

    public double getComponentY() {
        return componentY;
    }

    public static Vector fromAngleMagnitude(double angle, double magnitude) {
        return new Vector(magnitude * Math.cos(angle), magnitude * Math.sin(angle));
    }
}

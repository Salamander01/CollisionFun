package Physics;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Vector {

    double xComponent;
    double yComponent;

    public Vector(double xComponent, double yComponent) {
        this.xComponent = xComponent;
        this.yComponent = yComponent;
    }

    public static Vector fromAngleMagnitude(double angle, double magnitude) {
        return new Vector(magnitude * cos(angle), magnitude * sin(angle));
    }

    public Vector add(Vector vector) {
        return new Vector(this.xComponent + vector.xComponent, this.yComponent + vector.yComponent);
    }
}

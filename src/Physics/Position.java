package Physics;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Position {

    private double x;
    private double y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != Position.class) throw new IllegalArgumentException("Position.equals() only accepts other Position objects.");
        Position pos = (Position) obj;
        return this.x == pos.x && this.y == pos.y;
    }

    double distanceTo(Position position) {
        return sqrt(pow(this.x + position.x, 2) + pow(this.y + position.y, 2));
    }
}

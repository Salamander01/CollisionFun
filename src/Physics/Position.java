package Physics;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public record Position(double x, double y) {

    double distanceTo(Position position) {
        return sqrt(pow(this.x + position.x, 2) + pow(this.y + position.y, 2));
    }
}

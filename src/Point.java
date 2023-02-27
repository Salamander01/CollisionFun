public record Point(int x, int y) {

    public double distanceTo(Point point) {
        return Math.sqrt((this.x + point.x) * 2 + (this.y + point.y) * 2);
    }
}

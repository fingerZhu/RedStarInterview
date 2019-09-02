public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x:" + this.x + " y:" + this.y;
    }

    public Point sub(Point p) {
        return new Point(this.x - p.x, this.y - p.y);
    }

    public double getLength() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Point divide(double val) {
        return new Point(this.x / val, this.y / val);
    }

    public Point normal() {
        return this.divide(this.getLength());
    }

    public double distanceTo(Point point) {
        double deltaX = this.x - point.x;
        double deltaY = this.y - point.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public boolean nearlEqual(Point point) {
        return this.nearlEqual(point, 0.001);
    }

    public boolean nearlEqual(Point point, double tolearnce) {
        return this.distanceTo(point) < tolearnce;
    }
}

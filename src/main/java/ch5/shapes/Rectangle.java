package ch5.shapes;

public class Rectangle extends AbstractShape implements TwoDimensional{
    private Point p1;
    private Point p2;

    public Rectangle() {
        setType("RECTANGLE");
        p1 = new Point(0.0, 0.0);
        p2 = new Point(0.0, 0.0);
    }

    public Rectangle(Point p1, Point p2) {
        setType("RECTANGLE");
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    @Override
    public double area() {
        return (Math.abs(p1.getX() - p2.getX()) * Math.abs(p1.getY() - p2.getY()));
    }
}

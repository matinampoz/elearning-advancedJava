package ch5.shapes;

public class Circle extends AbstractShape implements TwoDimensional{

    private Point center;
    private double radius;

    public Circle() {
        setType("CIRCLE");
        this.center = new Point(0.0, 0.0);
        this.radius = 0.0;
    }

    public Circle(Point center, double radius) {
        setType("CIRCLE");
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}

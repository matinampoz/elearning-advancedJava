package ch5.shapes;

import java.util.Locale;

/**
 * Defines a point in the two-dimensional space
 */
public class Point {

    private double x;
    private double y;

    public Point() {}

    public Point(double x, double y) {
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
    public String toString() {
        String outX = String.format(Locale.ENGLISH, "%.2f", x);
        String outY = String.format(Locale.ENGLISH, "%.2f", y);
        return "[" + outX + "," + outY + "]";
    }
}

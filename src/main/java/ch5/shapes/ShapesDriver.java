package ch5.shapes;

import java.util.Arrays;
import java.util.List;

public class ShapesDriver {
    public static void main(String[] args) {
        Point p1 = new Point(3.0, 8.0);
        Point p2 = new Point(7.0,4.0);

        List<IShape> shapes;
        shapes = Arrays.asList(new Line (p1, p2),
                new Circle(p1, 12),
                new Rectangle(p1,p2));

        for (IShape shape : shapes) {
            shape.printShape();
        }
;    }
}

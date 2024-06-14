package ch5.shapes;
//κανω αναφορα σε άλλες κλεσεις - μεθοδους με την {@link AClass}
/**
 * {@link IShape} identifies an object by its type
 * e.g. {@link Line}, {@link Circle}, {@link Rectangle}
 *
 * @author A. Androutsos
 */
public interface IShape {
    /**
     * The returned type is defiened in {@link AbstractShape}
     * @return the type of the shape object
     */
    String getType();

    /**
     * Prints the type of the shape object, its state and its area if it is {@link TwoDimensional}
     */
    void printShape();
}

package ch5.shapes;

public abstract class AbstractShape implements IShape{

    private String type;

    public AbstractShape() {
        type = ""; //για να μην εχω null
    }

    @Override
    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    @Override
    public void printShape() {
        System.out.println(this);
        if (this instanceof TwoDimensional) {
            System.out.printf("Area: %.2f%n", ((TwoDimensional) this).area());
        }
    }

    @Override
    public abstract String toString();
}

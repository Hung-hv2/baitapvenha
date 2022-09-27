package OOPs.baitap11;

public class Rectangle implements GeometricObject {
    double width;
    double length;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[width=%f, length =%f]", width, length);
    }
}

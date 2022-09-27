package OOPs.baitap11;

public class Circle implements GeometricObject {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
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
        return String.format("Circle[radius=%f", radius);
    }
}

package cylinder;

public class Circle {
    double radius;
    // Creating a constructor
    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else
            this.radius = radius;
    }
    // Creating a method to get radius
    public double getRadius() {
        return radius;
    }
    // Creating a method to get area
    public double getArea() {
        return radius*radius*Math.PI;
    }
}

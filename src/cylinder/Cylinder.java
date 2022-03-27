package cylinder;

public class Cylinder extends Circle {
    double height;

    //Defining a constructor
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else
            this.height = height;
    }

    //Defining a method to get height
    public double getHeight() {
        return height;
    }


    //Defining a method to get volume
    public double getVolume() {
        return getArea()*height;
    }
}

package poolarea;

public class Rectangle {
    //instance variable
    double width;
    double length;

    //one constructor
    public Rectangle(double width, double length) {
        if (width < 0 && length < 0) {
            this.width = 0;
            this.length = 0;
        } else{
            this.width=width;
            this.length=length;
        }
    }
    //instance methods
    //method 1
    public double getWidth(){
        return width;
    }
    //method 2
    public double getLength(){
        return length;
    }
    //method 3
    public double getArea(){
        return width*length;
    }
}

package poolarea;

public class Cuboid extends Rectangle {
    //instance variable
    double height;
    //one constructor
    public Cuboid(double width, double length, double height){
        super(width, length);
        if(height<0){
            this.height=0;
        }else {
            this.height=height;
        }
    }
    //methods
    //method 1
    public double getHeight(){
        return height;
    }
    //method 2
    public double getVolume(){
        return getArea()*height;
    }
}


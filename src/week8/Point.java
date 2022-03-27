package week8;

public class Point {
    int x;
    int y;

    //first constructor without argument
    Point() {

    }

    //second constructor with parameter
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //first method
    public int getX() {
        return x;
    }

    //second method
    public int getY() {
        return y;
    }

    //third method
    public void setX(int x) {
        this.x = x;
    }

    //fourth method
    public void setY(int y) {
        this.y = y;
    }

    //fifth method
    public double distance() {
        return distance(0, 0);
    }

    //sixth method
    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
    //seven method
    public double distance(Point another){
        return distance(another.x, another.y);
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

    }
}

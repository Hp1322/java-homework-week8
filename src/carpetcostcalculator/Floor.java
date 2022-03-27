package carpetcostcalculator;

public class Floor {
    double width;
    double lengh;

    //one constructor
    public Floor(double width, double lengh) {
        if (width < 0 && lengh > 0) {
            this.width = 0.0;
            this.lengh = lengh;
        } else if (width > 0 && lengh < 0) {
            this.width = width;
            this.lengh = 0.0;
        } else {
            this.width = width;
            this.lengh = lengh;
        }

    }

    //instance method
    public double getArea() {
        return this.width * this.lengh;
    }
}
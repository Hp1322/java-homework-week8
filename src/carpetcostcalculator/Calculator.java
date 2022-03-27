package carpetcostcalculator;

public class Calculator {
    //instance variable
   Floor floor;
   Carpet carpet;
   //one constructor
    public Calculator(Floor floor, Carpet carpet){
        this.carpet=carpet;
        this.floor=floor;
    }
    //instance method
    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }
}

package week8;

public class SimpleCalculator {
    //instance variable
    double firstNumber;
    double secondNumber;

    //methods
    //method 1
    public double getFirstNumber(){
        return firstNumber;
    }
    //method 2
    public double getSecondNumber(){
        return secondNumber;
    }
    //method 3
    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    //method 4
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
    //method 5
    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }
    //method 6
    public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }
    //method 7
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
    //method 8
    public double getDivisionResult(){
        if (secondNumber==0){
            return secondNumber = 0.0;
        }else{
            return firstNumber/secondNumber;
        }
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}

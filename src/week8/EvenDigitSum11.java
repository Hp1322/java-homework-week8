package week8;

import java.util.Scanner;
public class EvenDigitSum11 {
    public static void main(String[] args) {
        EvenDigitSum11 obj11 = new EvenDigitSum11();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int numofeven = sc.nextInt();
        if(getEvenDigitSum(numofeven)!=-1){
            System.out.println("The sum of even digit sum "+numofeven+" is "+getEvenDigitSum(numofeven));
        }else {
            System.out.println("Invalid Input"+getEvenDigitSum(numofeven));
        }
    }

    public static int getEvenDigitSum(int number) {
        int total = 0;
        if (number > 0) {
            while (number > 0) {
                int even = number % 10;
                if (even % 2 == 0) {
                    total = total + even;
                }
                number = number / 10;
            }
        } else{
            total = -1;
        }
        return total;
    }

}

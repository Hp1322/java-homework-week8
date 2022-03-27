package week8;

import java.util.Scanner;
public class FirstAndLastDigitSum7 {
    public static void main(String[] args) {
        FirstAndLastDigitSum7 obj7 = new FirstAndLastDigitSum7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number :");
        int number = sc.nextInt();
        System.out.println("sum of first and last digits are :"+sumFirstAndLastDigit(number));
    }

    public static int sumFirstAndLastDigit(int a){
        int sum = 0;
        int lastdigit = a%10;
        while (a!=0){
            int b = a%10;
            sum = b;
            a =a/10;
        }
        return lastdigit+sum;
    }
}

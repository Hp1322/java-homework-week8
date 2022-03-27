package week8;

import java.util.Scanner;

public class DigitSumChallenge4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number :");
        int input = sc.nextInt();
        System.out.println(sumDigits(input));


    }

    public static int sumDigits(int number) {

        int sum = 0;
        if (number >= 10) {
            while (number >0) {
                int n = number % 10;
                sum = n + sum;
                number = number / 10;
            }
        } else {
            sum = -1;
        }
        return sum;


    }
}
package week8;

import java.util.Scanner;

public class PalindromeCheck5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number :");
        int input = sc.nextInt();
        System.out.println(isPalindrome(input));

    }
    public static boolean isPalindrome(int number){
        int sum = 0;
        boolean msg;
        int t = number;
        while (number!=0){
            int b = number%10;
            sum = (sum*10)+b;
            number = number/10;
        }
        if (t == sum)
            msg = true;
        else
            msg = false;
        return msg;


    }
}

package week8;

import java.util.Scanner;

public class SharedDigit13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int n1 = sc.nextInt();
        System.out.println("Enter second number :");
        int n2 = sc.nextInt();
        System.out.println(hasShareDigit(n1,n2));

    }

    public static boolean hasShareDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        while (a > 0) {
            int last1 = a % 10;
            int last2 = b % 10;
            int first1 = a / 10;
            int first2 = b / 10;
            if ((last1 == last2) || (last1 == first2) || (first1 == first2) || (first2 == first1)) {
                return true;
            }
            a = a/10;
            b = b/10;
        }
        return false;
    }
}

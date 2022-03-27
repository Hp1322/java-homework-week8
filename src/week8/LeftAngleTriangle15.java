package week8;

import java.util.Scanner;

public class LeftAngleTriangle15 {
    public static void main(String[] args) {
        LeftAngleTriangle15 obj15 = new LeftAngleTriangle15();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter left angled triangle pattern rows");
        int rnumber = sc.nextInt();
        obj15.getLeftAngle(rnumber);
    }
    public void getLeftAngle(int a){

        for(int i=0; i<= a;i++) {

            for (int j = 2 * (a-i); j>=0; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

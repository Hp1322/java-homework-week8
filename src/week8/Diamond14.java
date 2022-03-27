package week8;

import java.util.Scanner;

public class Diamond14 {
    public static void main(String[] args) {
        Diamond14 obj14 = new Diamond14();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows");
        int rownumber1 = sc.nextInt();
        obj14.getDiamond(rownumber1);
    }

    public void getDiamond(int a) {
        int b = 1;//row
        int i = a / 2;//rows
        while (i > 0) {
            int j = 1;
            while (j <= i) {
                System.out.print(" ");//print space
                j++;
            }
            j = 1;
            while (j <= b) {
                System.out.print("*" +" ");
                j++;
            }
            System.out.println();//move to next line
            b++;
            i--;
        }
        i = 0;
        while (i <= a / 2) {//print lower port
            int j = 1;
            while (j <= 1) {
                System.out.print(" ");//print space
                j++;
            }
            j = b;
            while (j >= 1) {
                System.out.print("*" + " ");//print number
                j--;
            }
            System.out.println();//move to next line
            b--;
            i++;
        }

    }


}

package week8;

import java.util.Scanner;
public class RightAngleTriangle8 {
    public static void main(String[] args) {
        RightAngleTriangle8 ob = new RightAngleTriangle8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter right angled triangle pattern rows");
        int rowsnumber = sc.nextInt();
        ob.triAngle(rowsnumber);
    }

    public void triAngle(int a){
        for(int i =1; i<=a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    }



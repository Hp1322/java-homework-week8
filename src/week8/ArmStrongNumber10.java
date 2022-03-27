package week8;

import java.util.Scanner;

public class ArmStrongNumber10 {
    public static void main(String[] args) {
        ArmStrongNumber10 obj10 = new ArmStrongNumber10();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int armnumber = sc.nextInt();
        System.out.println(obj10.armStrong(armnumber));

    }

    public String armStrong(int number) {
        double sum =0;
        int digit = 0;
        int last = 0;
        String msg;

        int temp = number;
        while (temp>0){//finding length of given number
            temp = temp/10;
            digit++;
        }
        temp = number;
        while (temp>0){
            last = temp%10;//finding last digit
            sum = sum + (Math.pow(last,digit));
            temp = temp/10;//removing last digit
        }
        if (number == sum){
            msg = "given number is Armstrong Number";
        }else
            msg = "given number is not Armstrong Number";
        return msg;

    }
}

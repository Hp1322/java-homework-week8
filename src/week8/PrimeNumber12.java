package week8;

import java.util.Scanner;

public class PrimeNumber12 {
    public static void main(String[] args){
        PrimeNumber12 obj12 = new PrimeNumber12();
        obj12.priNumber();
    }
    public void priNumber(){
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n1 = sc.nextInt();
        for (int i = 2; i <= n1 / 2; i++) {
            if (n1 % i==0)  {
                result = 0;
                break;
                //System.out.println(n1+" is prime number");
            } else {
                result = 1;
                //   System.out.println(n1+" is not prime number");
            }
        }
        if (result == 0) {
            System.out.println("is not prime number");
        } else {
            System.out.println("is prime number");
        }


    }
}

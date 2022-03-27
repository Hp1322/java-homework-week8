package week8;

import java.util.Scanner;
public class FibonacciNumber9 {
    public static void main(String[] args) {
        FibonacciNumber9 obj9 = new FibonacciNumber9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci sequence");
        int fibonumber = sc.nextInt();
        obj9.fibonacci(fibonumber);
    }
    public void fibonacci(int a){
        int n=10; int firstnumber = 0; int secondnumber = 1;
        System.out.print(firstnumber+"\t"+secondnumber);
        for (int i = 1; i<=n; ++i){
            int nextnumber = firstnumber+secondnumber;
            firstnumber=secondnumber;
            secondnumber=nextnumber;
            System.out.print("\t"+nextnumber);

        }

    }
}

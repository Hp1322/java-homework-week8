package week8;

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        Programme6 p =new Programme6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int input = sc.nextInt();
        p.printtriangle(input);


    }
    public void printtriangle(int a){
        for(int i =1; i<=a; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

}

package week8;

import java.util.Scanner;
public class MinAndMaxInputChallenge2 {
    public static void main(String[] args) {
        MinAndMaxInputChallenge2 ob = new MinAndMaxInputChallenge2();
        ob.maxMin();

    }
    public void maxMin(){
        Scanner sc = new Scanner(System.in);
        int count =0;
        int min =0;
        int max =0;
        boolean result = true;

        while (true){
            int b = count++;
            System.out.println("Enter Number"+(b)+":");
            boolean isValid = sc.hasNextInt();
            if(isValid) {
                int num = sc.nextInt();
                if(result){
                    result = false;
                    min = num;
                    max = num;
                }

                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }  } else {
                    System.out.println("Invalid input ");
                    break;
                }
                sc.nextLine();

        }
        System.out.println("Min Number :"+min);
        System.out.println("Max Number :"+max);

    }
}

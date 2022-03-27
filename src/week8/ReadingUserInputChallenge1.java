package week8;

import java.util.Scanner;

public class ReadingUserInputChallenge1 {
    public static void main(String[] args) {
        ReadingUserInputChallenge1 t = new ReadingUserInputChallenge1();
        t.sum1();

    }

    public void sum1() {
        int count = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while (count <= 10) {
            System.out.println("Enter number #" + count);
            boolean validnumber = sc.hasNextInt();

            if (validnumber) {
                int number = sc.nextInt();
                sum = sum + number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            sc.nextLine();
        }

        System.out.println("Sum of all number  "+sum);


    }
}

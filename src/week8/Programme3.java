package week8;

import java.util.Locale;
import java.util.Scanner;
public class Programme3 {
    public static void main(String[] args) {
        Programme3 p = new Programme3();
        p.checkVowel();

    }
    public void checkVowel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet :");
        String a = sc.nextLine();
        String b = a.toLowerCase(Locale.ROOT);
        char vow = b.charAt(0);
        boolean check = Character.isAlphabetic(vow);
        if (b.length() == 1 && check){
            if(vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u')
            System.out.println(vow+" is vowel");
            else
                System.out.println(vow+" is consonant");
        }
        else
            System.out.println("Invalid input");
    }
}

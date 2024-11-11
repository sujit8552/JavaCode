package sujit;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        // Case check : tell if the character is uppercase or lowercase
        Scanner sc = new Scanner(System.in);
       // Note: To take char out of string use below method
        //  sc.next().trim().charAt(0);
        System.out.println("Enter any case character");
        char ch = sc.next().trim().charAt(0);

        if ( ch > 'a' && ch < 'z')
        {
            System.out.println("Lowercase...");
        }
        else
        {
            System.out.println("Uppercase...");
        }

    }
}

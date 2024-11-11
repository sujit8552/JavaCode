package sujit;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Switch statements
        System.out.println("Enter fruit");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit)
        {
            case "Apple":
                System.out.println("Apple Entered");
                break;
            case "Orange":
                System.out.println("Orange Entered");
                break;
            case "Mango":
                System.out.println("Mango Entered");
                break;
            default:
                System.out.println("Wrong fruit entered");
        }
    }
}

package sujit;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // Find largest among 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // First logic
//        if (a > b && a > c)
//        {
//            System.out.println(a + " is Largest number");
//        } else if (b>c && b>a) {
//            System.out.println(b + " is Largest number");
//        }
//        else {
//            System.out.println(c +" is Largest number");
//        }


        // Second logic
        /*
        int max  = a;
        if (b > max)
        {
            max = b;
        }
        if(c > max)
        {
            max = c;
        }
        System.out.println("Max number is "+ max);
        */

        // Third logic using Math lib
        int max = Math.max(c,Math.max(a,b));
        System.out.println("Max number is: " + max);
    }
}

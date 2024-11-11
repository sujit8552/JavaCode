package sujit;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Loops

        /*
        // 1) For loop
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i);
        }

        // Print numbers 1 to n and take user input for n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
        // Hello world n times
        for (int i=1; i<=n; i++)
        {
            System.out.println(i+ ": Hello World");
        }
        */
        //-------- While Loops-------------
//        int i = 1;
//        while (i <=5)
//        {
//            System.out.println("Hello World");
//            i++;
//        }

        //-------- Do while loop ----------
        int i = 1;
        do
        {
            System.out.println(i);
            i++;
        }
        while (i<=3);

    }
}



package sujit;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        // Write a code for fibonacci series
        int a = 0;
        int b = 1;
        System.out.println("Enter n for fibbo number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 2;
        while (count <= n)
        {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}

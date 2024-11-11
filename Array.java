package sujit;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Array
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 12;
        arr[3] = 40;
        arr[4] = 55;

        // To print array elements
//        for (int i =0; i<arr.length; i++)
//        {
//            System.out.println(arr[i]);
//        }

        // To take inputs in arr
//        int[] numbers = new int[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 5 elements in array: ");
//        for (int i =0; i<5; i++)
//        {
//            numbers[i] = sc.nextInt();
//        }
        // Print entered elements using for each loop
//        for( int num : numbers)
//        {
//            System.out.println(num);
//        }
        // Print entered elements using Arrays class
//        System.out.println(Arrays.toString(numbers));

        // Array of String

        String[] essay = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i< essay.length; i++)
        {
            essay[i] = sc.nextLine();
        }
        // Print the String array
//        for (String str : essay)
//        {
//            System.out.println(str);
//        }
        // Print using Arrays method
    }
}

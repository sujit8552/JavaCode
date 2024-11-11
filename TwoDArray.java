package sujit;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        // 2D: array
        // 2D array of integer

        int[][] arr = new int[3][2];
        Scanner sc = new Scanner(System.in);
        // Take inputs
        for (int row=0; row<3; row++){
            for (int col=0; col<2; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // Write output
        for (int row=0; row<3; row++){
            for (int col=0; col<2; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}

package sujit;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 5;
        // Search 5 in 2d array arr
        int[] new_arr = SearchInto2dArray(arr, target);
        System.out.println(Arrays.toString(new_arr));
        // Find max in 2d array
        System.out.println("Max num in array is: "+ FindMaxIn2dArray(arr));
        // Find min in 2d array
        System.out.println("Min num in array is: "+ FindMinIn2dArray(arr));
    }

    static int[] SearchInto2dArray(int[][] arr, int target)
    {
        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[0].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Method to find max in 2d array
    static int FindMaxIn2dArray(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    // Method to find min in 2d array
    static int FindMinIn2dArray(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                if (arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }

























}

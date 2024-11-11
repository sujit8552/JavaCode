package sujit;

public class CountEvenNumOfDigits {
    public static void main(String[] args) {
        // Leetcode question: Given an array nums of int, return how many of them contain an
        // even number of digits.
        int [] nums = {12,345,2,6,7896}; // ans should be 2 (12 & 7896)

        // first : count the number of digits in a number
        // second : check if that "number of digits" is even or not
        // third : if it is even increase the result count and return

        System.out.println(FindNumbers(nums));

    }
    static int FindNumbers(int[] arr){
        int count = 0;
        for (int num: arr)
        {
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits
    static boolean even (int num)
    {
        int no_of_digits = CountDigitsInNumber(num);
        return no_of_digits % 2 ==0;
    }

    static int CountDigitsInNumber(int num) {
        int count = 0;
        while (num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
}

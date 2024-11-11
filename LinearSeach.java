package sujit;

public class LinearSeach {
    public static void main(String[] args) {
        // Code for linear search
        // Consider an array and find the target and print its index

        int[] nums = {1,13,25,9,14,40};
        int target = 40;
        System.out.println("Target index is: "+linearSearch(nums,target));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++)
        {
            int element = arr[index];
            if (element == target)
            {
                return index;
            }
        }
        // if none of the above return works then this will return
        return -1;
    }
}

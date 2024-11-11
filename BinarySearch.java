package sujit;

public class BinarySearch {
    public static void main(String[] args) {
                     //0,1,2,3,4,5,6,7,8,9
        int[] nums = {-20,-15,-10,0,2,3,4,7,8,20,36,40};
        int target = 40; //9th index
        int ans = binarySearch(nums,target);
        System.out.println("Target found at index: "+ ans);
    }

    // code for binarySearch

    public static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length;
        while (start <= end)
        {
            // find the middle element
            int mid = start + (end - start)/2;
            if (target<arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                // target found and it is middle element
                return mid;
            }
        }
        return -1;
    }
}

/*
852. Peak Index in a Mountain Array

You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

*/
/**
 * this is just binery search problem. named diffrent. 
 */
public class peakIndexInAMountainArray {

    public static int solve(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        if (mid == 0 || mid == arr.length - 1) {
            return -1;
        }
        int midvalue = arr[mid];
        if (midvalue > arr[mid - 1] && midvalue > arr[mid + 1]) {
            return mid;
        }
        if (midvalue > arr[mid - 1] && midvalue < arr[mid + 1]) {
            return solve(arr, mid, end);
        }
        if (midvalue < arr[mid - 1]) {
            return solve(arr, start, mid);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 15, 9, 7, 6, 1 };
        System.out.println(solve(arr, 0, arr.length - 1));
    }
}
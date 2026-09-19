/**
287. Find the Duplicate Number

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.


Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
 */
import java.util.HashSet;
public class findOneDublicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        
        // this is O(n^2) wrote by me. solution that lead to time limit error
        /* 

        for(int i = 1;i<arr.length;i++){
            int value = arr[i];
            for(int j = 0;j<i;j++){
                if(arr[j] == arr[i]){
                    System.out.println("Dublicate foud at index "+ i +" and "+ j );
                    return ;
                }
            }
        }

        */

        // below is the fast solution as set only stores unique values. 
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {  
                System.out.println("Dublicate found is " + num );
                return ;
            }
        }
        return ;
    }
    
}
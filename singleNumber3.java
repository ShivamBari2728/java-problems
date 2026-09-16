/**
260. Single Number III

Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

Example 1:

Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.

 */
// one approth is to create a map of frequency . and then return numbers with frequency == 1;
// this is using map frequnecy idk how but leet code also accepted this solution . 
import java.util.*;
public class singleNumber3 {

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] ans = new int[2];
        int j = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele : nums){
            if(map.get(ele) == 1) {
                ans[j] = ele;
                j++;
            }
        }
        System.out.print(Arrays.toString(ans));
    }
}



// this is using XOR 
// class Solution {
//     public int[] singleNumber(int[] nums) {

//         int xor = 0;

//         // Find xor of the two unique numbers
//         for (int i = 0; i < nums.length; i++) {
//             xor = xor ^ nums[i];
//         }

//         // Find one bit where the two unique numbers are different
//         int bit = xor & (-xor);

//         int first = 0;
//         int second = 0;

//         // Divide numbers into two groups
//         for (int i = 0; i < nums.length; i++) {

//             if ((nums[i] & bit) == 0) {
//                 first = first ^ nums[i];
//             } else {
//                 second = second ^ nums[i];
//             }
//         }

//         return new int[]{first, second};
//     }
// }
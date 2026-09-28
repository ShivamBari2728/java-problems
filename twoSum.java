/*
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
// This solution uses O(n^2) runtime.
public class twoSum {
    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }

    }
}


// Optimal solution uses hash map and O(n) runtime.
/*

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i <arr.length;i++){
            if(mp.containsKey(target - arr[i])){
                System.out.println("Target sum at "+ mp.get(target-arr[i])+ " "+i);
                return;
            }
            mp.put(arr[i], i);
        }

    }
}


*/
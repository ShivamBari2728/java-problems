import java.util.ArrayList;
import java.util.List;

/**
 * makeArrayNondecreasing
 */

// below code just solve this problme at once but i want this in steps.
// public class makeArrayNondecreasing {

// public static void main(String[] args) {
// int[] nums = {5,3,4,4,7,3,6,11,8,5,11};
// ArrayList<Integer> eliminate = new ArrayList<>();

// int pointer = 0;
// for(int i = 0;i<nums.length -1;i++){

// pointer = i+1;
// while(nums[i]>nums[pointer]){
// eliminate.add(pointer);
// pointer ++;
// }
// i = pointer - 1;
// }
// System.out.println(eliminate);

// }
// }

//---------------------------------------

// this is my other code where i am doing this opertions in steps and returnong cout at the end it passed but stuck at TLE

// Output Limit Exceeded
// 77 / 87 testcases passed


public class makeArrayNondecreasing {

    public static void main(String[] args) {
        // int[] nums = {5,3,4,4,7,3,6,11,8,5,11};
        ArrayList<Integer> nums = new ArrayList<>(List.of(5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11));

        ArrayList<Integer> eliminate = new ArrayList<>();
        boolean runagain = true;

        int counter = 0;
        while (runagain) {
            

            for (int i = 0; i < nums.size() - 1; i++) {
                if (nums.get(i) > nums.get(i + 1)) {
                    eliminate.add(i + 1);
                }
            }
            if (eliminate.size() == 0) {
                runagain = false;

            } 
            else {

                while (eliminate.size() > 0) {

                    int removedIndex = eliminate.removeFirst();

                    nums.remove(removedIndex);

                    for (int i = 0; i < eliminate.size(); i++) {
                        if (eliminate.get(i) > removedIndex) {
                            eliminate.set(i, eliminate.get(i) - 1);
                        }
                    }
                }
                System.out.println(nums);
                counter ++;
            }

            
        }
    }
}

// optimal solution uses stack 
/*
class Solution {
    public int totalSteps(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];

        Stack<Integer> stack = new Stack<>();

        int answer = 0;

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {

                dp[i] = Math.max(dp[i] + 1, dp[stack.peek()]);

                stack.pop();

                answer = Math.max(answer, dp[i]);
            }

            stack.push(i);
        }

        return answer;
    }
}
*/
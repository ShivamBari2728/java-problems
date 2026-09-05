import java.lang.reflect.Array;
import java.util.*;

/**
 * rotateArray
 */

// my origan approtch..
/** 
public class rotateArray {

    public static void main(String[] args) {
       int[] nums = new int[]{1,2,7};
       int steps = 2;
       int carry =0;

       if(nums.length > 1){

        for(int i = 0; i<steps;i++){

        for(int j =0;j<nums.length -1;j++){
            if(j>0){
                int carry2 = nums[j+1];
                nums[j+1] = carry;
                carry = carry2;
            }
            else{
            carry = nums[j+1];
            nums[j +1] = nums[j];
            nums[j] = nums[nums.length-1];
            }
        }

       }

       }else{
        
       }
       
       System.out.println(Arrays.toString(nums));
    }
}
    
*/

import java.util.*;

public class rotateArray {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 7 };
        int steps = 2;

        if (nums.length == 0) {

        } else {
            for (int i = 0; i < steps; i++) {

                int carry = nums[nums.length - 1];

                for (int j = nums.length - 1; j > 0; j--) {
                    nums[j] = nums[j - 1];
                }

                nums[0] = carry;
            }

        }

        System.out.println(Arrays.toString(nums));
    }
}

// leet code best approtch 

/*

class Solution {
    public void rotate(int[] nums, int k) {

        if (nums.length == 0) {
            return;
        }

        k = k % nums.length;

        int n = nums.length;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}

*/
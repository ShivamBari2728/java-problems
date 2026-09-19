/**
 * trapRainWater
 */

import java.util.ArrayList;

/**
 * trapRainWater
 */
// most recent soltuion by me .. ofc i took help of ai for some debugging. 
public class trapRainWater {
    public  static  int calculatewater(int left,int right,int[] arr){
        int value = 0;
        int smallestwall = Math.min(arr[left], arr[right]);
        for(int i = left +1;i<right;i++){
            
            value = value + ( smallestwall - arr[i]);
            System.out.println(  smallestwall+ " - " + arr[i] + " = "+value);
        }
        return value;
    }

    public static void main(String[] args) {

        int[] arr = {4,2,0,3,2,5};
        int waterstored = 0;

         int n = arr.length;

        int i = 0;
        while (i < n - 1) {

            // Not a left wall if the next bar isn't lower
            if (arr[i + 1] >= arr[i]) {
                i++;
                continue;
            }

            int left = i;
            int right = -1;
            int maxIdx = i + 1;   // tallest bar seen so far to the right

            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[left]) {   // wall tall enough -> valley closed
                    right = j;
                    break;
                }
                if (arr[j] > arr[maxIdx]) {  // remember tallest (first occurrence)
                    maxIdx = j;
                }
            }

            // No bar as tall as left wall: water is capped by the tallest bar
            if (right == -1) {
                right = maxIdx;
            }

            // right == left + 1 means no gap between walls, so no valley
            if (right - left > 1) {
                System.out.println("Valley found from " + left + " to " + right);
                waterstored += calculatewater(left, right, arr);
            }

            i = right;  
        }
        System.out.println("total water stored = "+waterstored);
    }
}


// public class trapRainWater {

//     static int watercount = 0;

//     public static void calculatewater(int start, int end, int[] arr) {

//         int volume = 0;
//         int waterLevel = Math.min(arr[start], arr[end]);

//         for (int i = start + 1; i < end; i++) {
//             volume += waterLevel - arr[i];
//         }

//         watercount += volume;

//         System.out.println("volume calculated " + volume);
//         System.out.println("water count " + watercount);
//     }

//     public static void main(String[] args) {

//         int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

//         int i = 0;
//         int current = i + 1;

//         while (current < arr.length - 1) {

//             if (arr[i] > arr[current] && arr[current] < arr[current + 1]) {

//                 while (arr[current] < arr[current + 1]
//                         && arr[current + 1] <= arr[i]) {
//                     current++;
//                 }

//                 // No proper closing wall found
//                 if (arr[current] < arr[i] &&
//                     arr[current + 1] <= arr[current]) {

//                     i++;
//                     current = i + 1;
//                     continue;
//                 }

//                 int end;

//                 // Current itself is the closing wall
//                 if (arr[current] >= arr[i]) {
//                     end = current;
//                 } else {
//                     // Next element is the closing wall
//                     end = current + 1;
//                 }

//                 System.out.println(
//                     "found valley from index: " + i + " to " + end
//                 );

//                 calculatewater(i, end, arr);

//                 i = end;
//                 current = i + 1;

//             } else {

//                 if (arr[i] > arr[current]) {
//                     current++;
//                 } else {
//                     i++;
//                     current = i + 1;
//                 }
//             }
//         }
//     }
// }


/*"
optimal solution .


class Solution {
    public int trap(int[] height) {

        int leftMax = 0;
        int rightMax = 0;

        int left = 0;
        int right = height.length - 1;

        int water = 0;

        while (left < right) {

            if (height[left] < height[right]) {

                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }

                left++;

            } else {

                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }

                right--;
            }
        }

        return water;
    }
}
" */
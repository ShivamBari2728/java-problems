/*
845. Longest Mountain in Array

You may recall that an array arr is a mountain array if and only if:
arr.length >= 3
Given an integer array arr, return the length of the longest subarray, which is a mountain. Return 0 if there is no mountain subarray.

Example 1:

Input: arr = [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
*/

import java.util.*;

/**
 * My solution got lengthy becaue i asumed that a mountain can directly start from peak . but later i found out a mountain in this case should have both decend and assend .
 * 
 * the optimal solution given below is much faster and better ofcourse.
 */
public class longestMountainArray {

    public static int decendpart(int[] arr, int start,
            ArrayList<List<Integer>> result,
            ArrayList<String> type) {

        ArrayList<Integer> deceIntegers = new ArrayList<>();

        while (start < arr.length - 1 && arr[start] > arr[start + 1]) {
            deceIntegers.add(arr[start]);
            start++;
        }

        if (start < arr.length) {
            deceIntegers.add(arr[start]);
        }

        System.out.println("decending mountain :" + deceIntegers);

        result.add(new ArrayList<>(deceIntegers));
        type.add("dec");

        deceIntegers.clear();

        return start - 1;
    }

    public static int asscendpart(int[] arr, int start,
            ArrayList<List<Integer>> result,
            ArrayList<String> type) {

        ArrayList<Integer> assendIntegers = new ArrayList<>();

        while (start < arr.length - 1 && arr[start] < arr[start + 1]) {
            assendIntegers.add(arr[start]);
            start++;
        }

        if (start < arr.length) {
            assendIntegers.add(arr[start]);
        }

        System.out.println("assending mountain :" + assendIntegers);

        result.add(new ArrayList<>(assendIntegers));
        type.add("asc");

        assendIntegers.clear();

        return start - 1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 5, 9, 6, 3, 1, 4, 8, 7, 5, 2, 3, 6, 10, 8, 4, 2, 7, 5, 3, 1,4, 9, 12, 11, 6, 2, 5 };
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<String> type = new ArrayList<>();

        int maxsize = 0;
        int maxarrayindex = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i < arr.length - 1) {

                if (arr[i] > arr[i + 1]) {
                    i = decendpart(arr, i, result, type);
                }

                if (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                    i = asscendpart(arr, i, result, type);
                }
            }
        }

        for (int i = 0; i < result.size() - 1; i++) {
            if (type.get(i).equals("asc") && type.get(i + 1).equals("dec")) {
                List<Integer> current = result.get(i);
                List<Integer> next = result.get(i + 1);
                if (current.get(current.size() - 1).equals(next.get(0))) {
                    current.addAll(next.subList(1, next.size()));
                    result.remove(i + 1);
                    type.remove(i + 1);
                    i--;
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).size() > maxsize) {
                maxsize = result.get(i).size();
                maxarrayindex = i;
            }
        }

        System.out.println(result);
        System.out.println("Largest mountain is : " + result.get(maxarrayindex));

    }
}


/*
Optimal solution.

public class LongestMountainArray {

    public static int longestMountain(int[] arr) {

        int longest = 0;
        int i = 1;

        while (i < arr.length - 1) {

            // Check whether i is a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {

                int left = i;
                int right = i;

                // Move left through ascending part
                while (left > 0 && arr[left - 1] < arr[left]) {
                    left--;
                }

                // Move right through descending part
                while (right < arr.length - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                int length = right - left + 1;

                longest = Math.max(longest, length);

                // We already processed everything up to right
                i = right;
            } else {
                i++;
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] arr = {
            2, 5, 9, 6, 3,
            1, 4, 8, 7, 5, 2,
            3, 6, 10, 8, 4,
            2, 7, 5, 3, 1,
            4, 9, 12, 11, 6, 2, 5
        };

        System.out.println(longestMountain(arr));
    }
}
*/
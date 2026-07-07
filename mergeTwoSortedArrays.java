// 29. Merge two sorted arrays into one sorted array.

import java.util.Arrays;

public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8,20,56};
        int[] arr3 = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p1 < arr1.length && p2 < arr2.length) {

            if (arr1[p1] < arr2[p2]) {
                arr3[p3] = arr1[p1];
                p1++;
            } else {
                arr3[p3] = arr2[p2];
                p2++;
            }

            p3++;
        }
        while (p1 < arr1.length) {
            arr3[p3] = arr1[p1];
            p1++;
            p3++;
        }
        while (p2 < arr2.length) {
            arr3[p3] = arr2[p2];
            p2++;
            p3++;
        }

        System.out.println(Arrays.toString(arr3));
    }
}
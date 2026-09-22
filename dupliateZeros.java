/*
1089. Duplicate Zeros

Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

Example 1:

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 */

import java.util.Arrays;

public class dupliateZeros {
    public static void insertzeros(int pointe,int[] arr){
        int temp = arr[pointe];
        arr[pointe] = 0;
        int temp2 = 0;
        while (pointe < arr.length -1) {
            
            temp2 = arr[pointe+1];
            arr[pointe +1 ]= temp;
            temp = temp2;
            pointe ++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0};
        int pointer = 0;
        while(pointer < arr.length-1){
            if(arr[pointer] == 0){
                insertzeros(pointer +1,arr);
                pointer = pointer + 2;
            }else{
                pointer ++;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
}

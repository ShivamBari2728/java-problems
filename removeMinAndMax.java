/**
 * 2091. Removing Minimum and Maximum From Array
 * 
 * There is an element in nums that has the lowest value and an element that has
 * the highest value. We call them the minimum and maximum respectively. Your
 * goal is to remove both these elements from the array.
 * 
 * A deletion is defined as either removing an element from the front of the
 * array or removing an element from the back of the array.
 * 
 * Return the minimum number of deletions it would take to remove both the
 * minimum and maximum element from the array.
 * 
 * Example 1:
 * 
 * Input: nums = [2,10,7,5,4,1,8,6]
 * Output: 5
 * Explanation:
 * The minimum element in the array is nums[5], which is 1.
 * The maximum element in the array is nums[1], which is 10.
 * We can remove both the minimum and maximum by removing 2 elements from the
 * front and 3 elements from the back.
 * This results in 2 + 3 = 5 deletions, which is the minimum number possible.
 */
public class removeMinAndMax {
    public static void main(String[] args) {
        int[] arr = { 2, 10, 7, 5, 4, 1, 8, 6 };
        int min = arr[0];
        int max = arr[0];
        int minindex = 0;
        int maxindex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minindex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxindex = i;
            }
        }

        System.out.println(minindex + " " + maxindex);
        // remove from backonly.

        int removefromback = (arr.length - (Math.min(maxindex, minindex) + 1)) + 1;

        // remove from frontonly.

        int removefromfront = arr.length - (arr.length - (Math.max(maxindex, minindex) + 1));

        // remove from bith side.
        int addition = (Math.min(maxindex, minindex) + 1) + arr.length - (Math.max(maxindex, minindex) + 1) + 1;

        System.out.println(removefromfront + "  " + removefromback + "  " + addition);
    }
}
/**
 * Product of Array Except Self
 * For every index, return the product of every other element.
 * 
 * Input:
 * [1,2,3,4]
 * 
 * Output:
 * [24,12,8,6]
 */
import java.util.Arrays;

public class productOfArreyExceptSelf {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] multiple = new int[arr.length];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                count = count * arr[j];
            }
            multiple[i] = count;
            count = 1;

        }
        System.out.println(Arrays.toString(multiple));
    }
}
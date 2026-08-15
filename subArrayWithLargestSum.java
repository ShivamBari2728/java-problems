/**
 * Find the contiguous subarray having the maximum sum.
 * 
 * Input:
 * [-2,1,-3,4,-1,2,1,-5,4]
 * 
 * Output:
 * 6
 * 
 * The subarray is:
 * [4,-1,2,1]
 */
public class subArrayWithLargestSum {

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int largestsum = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                count = 0;
                for (int k = i; k <= j; k++) {
                    count += arr[k];
                }
                System.out.println("count is : " + count + " for subarrey indexes " + i + "" + j);

                
                if (count > largestsum) {
                    largestsum = count;
                }
            }

        }

        System.out.println(largestsum);
    }
}
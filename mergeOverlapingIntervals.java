import java.util.ArrayList;
import java.util.Arrays;

/**
 * Merge all overlapping intervals.
 * 
 * Input:
 * [[1,4],[4,5]]
 * 
 * Output:
 * [[1,5]]
 */
public class mergeOverlapingIntervals {

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 9, 12 } };
        ArrayList<int[]> result = new ArrayList<>();

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] >= intervals[i + 1][0]) {
                result.add(new int[] { intervals[i][0], intervals[i + 1][1] });
            }
        }
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
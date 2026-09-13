import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 120. Triangle
 * 
 * Given a triangle array, return the minimum path sum from top to bottom.
 * 
 * For each step, you may move to an adjacent number of the row below. More
 * formally, if you are on index i on the current row, you may move to either
 * index i or index i + 1 on the next row.
 * 
 * Example 1:
 * 
 * Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
 * Output: 11
 * Explanation: The triangle looks like:
 * 2
 * 3 4
 * 6 5 7
 * 4 1 8 3
 * The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined
 * above).
 */

// this is another path approth where i am travesring every edjecent values to  fond path costs and printing minimum path . but this will throw time limit error for large input value.

public class triangleQuestion2 {

    public static int findpath(int i, int j, List<List<Integer>> triangle, int result,
            ArrayList<Integer> resultvalues) {

        result += triangle.get(i).get(j);

        if (i == triangle.size() - 1) {

            System.out.println("Found path: " + result);

            resultvalues.add(result);

            return result;
        }

        findpath(
                i + 1,
                j,
                triangle,
                result,
                resultvalues);

        findpath(
                i + 1,
                j + 1,
                triangle,
                result,
                resultvalues);

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> resultvalues = new ArrayList<>();

        List<List<Integer>> triangle = List.of(
                List.of(-1),
                List.of(2, 3),
                List.of(1, -1, -3));

        int result = 0;

        findpath(0, 0, triangle, result, resultvalues);

        System.out.println("All path results: " + resultvalues);

        int min = resultvalues.get(0);
        for (int i = 1; i < resultvalues.size(); i++) {
            if (resultvalues.get(i) < min) {
                min = resultvalues.get(i);
            }
        }
        System.out.println("Min path is :" + min);
    }
}
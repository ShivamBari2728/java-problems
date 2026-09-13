import java.util.List;
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


 // my approth chooses minimum value from give 2 option which is not entirely correct approth. 


public class triangleQuestion {
    public static int findpath(int i, int j, List<List<Integer>> triangle) {
    int result = 0;

    if (i == 0 && j == 0) {
        System.out.println("Choose 1st element");

        result += triangle.get(i).get(j);
        result += findpath(i + 1, j, triangle); 
    }
    else if (i >= triangle.size() || j + 1 >= triangle.get(i).size()) {
        System.out.println("Found path or at the end.");
        return 0;
    }
    else {
        int value1 = triangle.get(i).get(j);
        int value2 = triangle.get(i).get(j + 1);

        int minvalue = Math.min(value1, value2);

        if (minvalue == value1) {
            System.out.println("Choose " + value1);

            result += value1;
            result += findpath(i + 1, j, triangle);   
        }
        else {
            System.out.println("Choose " + value2);

            result += value2;
            result += findpath(i + 1, j + 1, triangle); 
        }
    }

    return result;
}

    public static void main(String[] args) {
        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3));

       System.out.println(findpath(0, 0, triangle));
    }


}
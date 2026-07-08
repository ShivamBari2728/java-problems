import java.util.Arrays;
import java.util.List;

public class minimumPathSumTriangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3));
        
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int value = triangle.get(i).get(j);
                System.out.println(value);
            }
        }
    }
}

// public class minimumPathSumTriangle2 {

//     public static void main(String[] args) {

//         List<List<Integer>> triangle = Arrays.asList(
//                 List.of(2),
//                 List.of(3, 4),
//                 List.of(6, 5, 7),
//                 List.of(4, 1, 8, 3));

//         int ans = minimumPath(triangle, 0, 0);

//         System.out.println(ans);
//     }

//     public static int minimumPath(List<List<Integer>> triangle, int row, int col) {

//         // Base Case
//         if (row == triangle.size() - 1) {
//             return triangle.get(row).get(col);
//         }

//         int left = minimumPath(triangle, row + 1, col);

//         int right = minimumPath(triangle, row + 1, col + 1);

//         return triangle.get(row).get(col) + Math.min(left, right);
//     }
// }
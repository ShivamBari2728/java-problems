/**
 * triangleOptimalSolution (optimal solution bottom up approtch)
 */
import java.util.*;
public class triangleOptimalSolution {
      static   public int minimumTotal(List<List<Integer>> triangle) {
         int n = triangle.size();

        int[] dp = new int[n];

        for (int j = 0; j < n; j++) {
            dp[j] = triangle.get(n - 1).get(j);
        }

        for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {

                dp[j] = triangle.get(i).get(j)
                        + Math.min(dp[j], dp[j + 1]);
            }
        }

        return dp[0];

    }
    public static void main(String[] args) {
        List<List<Integer>> triangle = List.of(
            List.of(-1),
            List.of(2, 3),
            List.of(1, -1, -3));

        System.out.println(minimumTotal(triangle));
        
    }
    

    
}
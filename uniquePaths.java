/**
 * 62. Unique Paths
 * 
 * There is a robot on an m x n grid. The robot is initially located at the
 * top-left corner (i.e., grid[0][0]). The robot tries to move to the
 * bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move
 * either down or right at any point in time.
 * 
 * Given the two integers m and n, return the number of possible unique paths
 * that the robot can take to reach the bottom-right corner.
 */

// my approth uses factorial to calcuate the combinations . but this will cause problme for big number of factorials.

public class uniquePaths {
    static int findfactorial(int x) {
        if(x== 0){
            return 1;
        }
        if (x == 1) {
            return 1;
        }

        return x * findfactorial(x - 1);
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int downmoves = (m - 1);
        int rightmoves = (n - 1);

        int cominationofmoves = findfactorial(downmoves + rightmoves)
                / (findfactorial(downmoves) * findfactorial((downmoves + rightmoves) - downmoves));

        System.out.println(cominationofmoves);

        /*
        * optimal solution

        int totalMoves = m + n - 2;
        int rightMoves = n - 1;

        long result = 1;

        for (int i = 1; i <= rightMoves; i++) {
            result = result * (totalMoves - rightMoves + i) / i;
        }

        return (int) result;
        
        */

    }
}

/* other formula.

    long numerator = 1;

    for (int i = 0; i < r; i++) {
        numerator *= (n - i);
    }

    long combination = numerator / factorial(r);
*/
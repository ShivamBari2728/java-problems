/*59. Spiral Matrix II

Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
*/
import java.util.ArrayList;

public class spiralMatrix2 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        ArrayList<Integer> result = new ArrayList<>();
        int top = 0, left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int number = 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[top][i]=number;
                number ++;
            }
            top++;
            for (int j = top; j <= bottom; j++) {
                matrix[j][right]=number;
                number++;

            }
            right--;

            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    matrix[bottom][k]=number;
                    number++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int l = bottom; l >= top; l--) {
                    matrix[l][left]=number;
                    number++;
                }
                left++;
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
        
    }
}

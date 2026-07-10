import java.util.ArrayList;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 56 },
                { 4, 5, 6, 69 },
                { 7, 8, 9, 85 }
        };
        ArrayList<Integer> result = new ArrayList<>();
        int top = 0, left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for (int j = top; j <= bottom; j++) {
                result.add(matrix[j][right]);
            }
            right--;

            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    result.add(matrix[bottom][k]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int l = bottom; l >= top; l--) {
                    result.add(matrix[l][left]);
                }
                left++;
            }

        }
        System.out.println(result.toString());
    }
}

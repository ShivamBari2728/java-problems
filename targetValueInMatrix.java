// 6. Search a 2D Matrix (from leet code)
public class targetValueInMatrix {
    public boolean searchMatrix(int[][] matrixA, int target) {
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                if (matrixA[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}

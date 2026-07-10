// 6. Search a 2D Matrix (from leet code)
//43. Find a target value in a 2D matrix (given rowCount, columnCount); return coordinates, else `(-1,-1)`.

import java.util.ArrayList;
import java.util.List;

public class targetValueInMatrix {
    public static void main(String[] args) {
        int[][] matrixA = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = 9;
        System.out.println(searchMatrix(matrixA, target).toString());
    }

    public static List<Integer> searchMatrix(int[][] matrixA, int target) {
        List<Integer> resultIntegers = new ArrayList<>();
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                if (matrixA[i][j] == target) {
                    resultIntegers.add(i);
                    resultIntegers.add(j);
                    return resultIntegers;
                }
            }
        }
        if (resultIntegers.isEmpty()) {
            resultIntegers.add(-1);
            resultIntegers.add(-1);
        }
        return resultIntegers;
    }
}

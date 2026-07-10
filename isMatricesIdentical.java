//40. Check if two matrices are identical (compare all elements).

public class isMatricesIdentical {
    public static void main(String[] args) {
         int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
         int[][] matrixB = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
       System.out.println(isIdentical(matrixA,matrixB));
    }
    static boolean isIdentical(int[][] matrixA,int[][] matrixB){
            if(matrixA.length != matrixB.length){
                return false;
            }
            for(int i = 0;i<matrixA.length;i++){
                if(matrixA[i].length != matrixB[i].length){
                    return false;
                }
                for(int j=0;j<matrixA[i].length;j++){
                    if(matrixA[i][j] != matrixB[i][j]){
                        return false;
                    }
                }
            }
            return true;
        }
}

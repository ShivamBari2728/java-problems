import java.util.Arrays;

/**
 * Move all zeroes to the end while maintaining the order of non-zero elements.
 * 
 * Input:
 * [0,1,0,3,12]
 * 
 * Output:
 * [1,3,12,0,0]
 */
public class moveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12,0};
        int end = arr.length-1;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i;j<end;j++){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
                end --;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
// 31. Find all triplets in an array that can form a triangle (condition: a + b > c).
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tripletsInAnArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 ,8};
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k <= arr.length - 1; k++) {
                    checkTriangle(Arrays.asList(arr[i], arr[j], arr[k]));
                    result.add(Arrays.asList(arr[i], arr[j], arr[k]));
                }
            }
        }
        System.out.println("All the triplets: "+result.toString());
    }

    public static void checkTriangle(List<Integer> l){
        Integer[] arr = l.toArray(new Integer[0]);
        Arrays.sort(arr);
        if(arr[2]<(arr[0]+arr[1])){
            System.out.println(Arrays.toString(arr) + "is a valid traingle triplet");
        }

    }
}

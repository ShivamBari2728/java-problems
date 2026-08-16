import java.util.ArrayList;
import java.util.HashSet;

/**
 * Find All Duplicates
 * Input:
 * [4,3,2,7,8,2,3,1]
 * 
 * Output:
 * [2,3]
 */
public class findDoublicatesInArray {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        HashSet<Integer> resultset = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i: nums){
            if(resultset.contains(i)){
                result.add(i);
            }
            else{
                resultset.add(i);
            }
        }
        System.out.println(result);
    }
}
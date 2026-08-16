import java.util.ArrayList;

/**
 * A = [1, 2, 2, 3, 4]
 * 
 * B = [2, 2, 4, 5]
 * 
 * Output = [2, 2, 4]
 */
public class intersectionInArray {

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 4 };
        int[] b = { 3, 2, 2, 4, 5 };
        ArrayList<Integer> vistedIndex = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = startpointforb; j < b.length; j++) {
                if(a[i] == b[j] && !vistedIndex.contains(j)){
                    result.add(a[i]);
                    vistedIndex.add(j);
                    continue;
                }
            }
        }
        System.out.println("Intersection of a and b is : " + result);
        System.out.println("Itersection of a found in b at indexs : " + vistedIndex);
    }
}
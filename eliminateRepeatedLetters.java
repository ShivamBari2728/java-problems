// 35. Eliminate repeated letters/elements from an array.
import java.util.ArrayList;
import java.util.List;

public class eliminateRepeatedLetters {
    public static void main(String[] args) {
        String[] arr = {"apple","ball","apple","cake"};
        List<String> result = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(!result.contains(arr[i])){ // could also use hash set so it wont add repeated items at all.
                result.add(arr[i]);
            }
        }
        System.out.println(result.toString());

    }
}

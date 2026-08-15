/**
 * characterFrequency
 */
import java.util.*;
public class characterFrequency {

    public static void main(String[] args) {
        String s = "programming";
       HashMap<Character, Integer> charFreq = new HashMap<>();
        for(int i =0; i<s.length();i++){
            if(charFreq.containsKey(s.charAt(i))){
                charFreq.put(s.charAt(i),(charFreq.get(s.charAt(i)) + 1));
            }
            else{
                charFreq.put(s.charAt(i),1);
            }
        }
        System.out.println(charFreq);

    }
}
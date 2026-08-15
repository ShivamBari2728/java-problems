import java.util.*;
/**
Remove duplicate characters while maintaining the original order.

Input:  "programming"
Output: "progamin"
 */
public class removeDublicateChar {

    public static void main(String[] args) {
        String s = "programming";
        LinkedHashSet<Character> result = new LinkedHashSet<>();
        for(int i =0 ; i<s.length();i++){
            result.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : result) {
            sb.append(ch);
        }
        s=sb.toString();
        System.out.println(s);
    }
}
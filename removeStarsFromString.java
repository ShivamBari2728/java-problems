
/**
 * removeStarsFromString
 */
import java.util.ArrayDeque;

public class removeStarsFromString {

    public static void main(String[] args) {
        String s = "erase*****";
        ArrayDeque<Character> stack = new ArrayDeque<>();
        int starcount = 0;
        StringBuilder st = new StringBuilder();
        for (int i = 0; i<s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (stack.size() > 0) {
            if (stack.peek() == '*') {
                while (stack.peek() != null && stack.peek() == '*') {
                    stack.pop();
                    starcount++;
                }
            }

            if (starcount > 0) {
                while (starcount != 0) {
                    stack.pop();
                    starcount--;
                }
            }
            if(stack.peek() != null){
                st.append(stack.pop());
            }
            

        }
        System.out.println(st.reverse().toString());

    }
}

/**
 * removeStarsFromString
 */
import java.util.ArrayDeque;

public class removeStarsFromString {

    public static void main(String[] args) {
        String s = "abb*cdfg*****x*";
        ArrayDeque<Character> stack = new ArrayDeque<>();
        int starcount = 0;
        StringBuilder st = new StringBuilder();
        for (int i = 0; i<s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (stack.size() > 0) {
            if (stack.peek() == '*') {
                while (stack.peek() != null && stack.peek() == '*') {
                   System.out.println("popped " +stack.pop());
                    starcount++;
                }
            }

            if (starcount > 0) {
                while (starcount != 0) {
                   if(stack.pop() == '*'){
                    starcount++;
                   }else{
                    starcount--;
                   }
                    
                }
            }
            if(stack.peek() != null && stack.peek()!= '*'){
                System.out.println("pushed to  st "+stack.peek());
                st.append(stack.pop());
            }
            

        }
        System.out.println(st.reverse().toString());

    }
}
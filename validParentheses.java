import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {

        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        String s = "[]{()}";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            else {

                if (stack.isEmpty()) {
                    System.out.println("False");
                    return;
                }

                if (stack.peek() == map.get(ch)) {
                    stack.pop();
                } else {
                    System.out.println("False");
                    return;
                }
            }
        }

        System.out.println(stack.isEmpty());
    }
}
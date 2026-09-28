/*
1190. Reverse Substrings Between Each Pair of Parentheses

Example 1:
Input: s = "(abcd)"
Output: "dcba"

Example 2:
Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.

*/

import java.util.ArrayList;

/**
 * reverseSubstringsParanthesis
 */
public class reverseSubstringsParanthesis {
    public static void reverseString(int start, int end, StringBuilder sb) {
        int tempstart = start;
        int tempend = end;
        start++;
        end--;
        while (start <= end) {
            char temp = sb.charAt(end);
            sb.setCharAt(end, sb.charAt(start));
            sb.setCharAt(start, temp);
            start++;
            end --;
        }
        sb.deleteCharAt(tempstart);
        tempend = tempend-1;
        sb.deleteCharAt(tempend);
    }

    public static void main(String[] args) {
        String sb = "(ed(et(oc))el)";
        StringBuilder s = new StringBuilder(sb);
        int i = 0;
        int endpointer = 0;
        int startpointer = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ')') {
                endpointer = i;
                for (int j = i; j >= 0; j--) {
                    if (s.charAt(j) == '(') {
                        startpointer = j;
                        reverseString(startpointer, endpointer, s);

                        //took help of ai for below line as my index chnges after deleting the paranthesis..
                        i = startpointer - 1;

                        break;
                    }
                }
            }
            i++;
        }
        System.out.println(s.toString());

    }
}

/*
Faster solution

class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder>stack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(curr);
                curr = new StringBuilder();
            }
            else if(ch==')'){
                curr.reverse();
                StringBuilder temp = stack.pop();
                temp.append(curr);
                curr = temp;
            }
            else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}

*/
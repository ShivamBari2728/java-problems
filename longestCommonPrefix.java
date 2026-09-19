/**
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

 */
public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        int pointer = 0;
       

        while (pointer < str[0].length()) {
            for (int i = 1; i < str.length; i++) {
                if (pointer >= str[i].length()
                        || str[i].charAt(pointer) != str[0].charAt(pointer)) {
                    System.out.println(str[0].substring(0, pointer));
                    return;
                }
            }
            pointer++;
        }

        System.out.println(str[0]);
    }
}
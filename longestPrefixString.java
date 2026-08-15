/**
Given an array of strings, find the longest common prefix.

Input:
["flower", "flow", "flight"]


Output:
"fl"
 */
public class longestPrefixString {

    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr[0].length(); i++) {

            for (int j = 1; j < arr.length; j++) {

                if (arr[j].length() <= i ||
                        arr[j].charAt(i) != arr[0].charAt(i)) {

                    System.out.println(result);
                    return;
                }
            }

            result.append(arr[0].charAt(i));
        }

        System.out.println(result);
    }
}
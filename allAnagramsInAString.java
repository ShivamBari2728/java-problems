import java.util.Arrays;

class allAnagramsInAString {

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        int pointer = 0;
        int endpointer = p.length();
        char[] sortedorg = p.toLowerCase().toCharArray();
        Arrays.sort(sortedorg);
        while (endpointer <= s.length()) {
            if (p.contains(String.valueOf(s.charAt(pointer)))) {
                isAnagram(sortedorg, s, pointer, endpointer);

            }
            pointer++;
            endpointer++;
        }
    }

    public static void isAnagram(char[] org, String st, int pointer, int endpoint) {
        char[] subString = st.substring(pointer, endpoint).toLowerCase().toCharArray();
        Arrays.sort(subString);
        if (Arrays.equals(subString, org)) {
            System.out.println("anagram found from index "+pointer+" to "+ endpoint );
        }
    }
}
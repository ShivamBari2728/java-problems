import java.util.ArrayList;

/**
 * Reverse the order of words in a sentence.
 * 
 * Input:
 * "I love programming"
 * 
 * Output:
 * "programming love I"
 */
public class reverseWordsInString {

    public static void main(String[] args) {
        String str = "I love programming";
        StringBuilder sb = new StringBuilder();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(str.charAt(i));
            }
        }
        result.add(sb.toString());
        sb.setLength(0);
        for (String st : result.reversed()) {
            sb.append(st + " ");
        }
        System.out.println(sb.toString());
    }
}
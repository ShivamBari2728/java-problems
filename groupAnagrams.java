import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class groupAnagrams {

    public static void main(String[] args) {
        String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<String> vistedStrings = new ArrayList<>();
        List<List<String>> resultList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (vistedStrings.contains(arr[i])) {
                continue;
            }
            List<String> group = new ArrayList<>();
            vistedStrings.add(arr[i]);
            group.add(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (!vistedStrings.contains(arr[j]) && isAnagram(arr[i], arr[j])) {
                    group.add(arr[j]);
                    vistedStrings.add(arr[j]);
                }

            }
            resultList.add(group);

        }
        System.out.println(resultList.toString());
    }

    private static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            System.out.println("Not an anagram");
            return false;
        } else {
            char[] sorteds = s.toLowerCase().toCharArray();
            char[] sortedt = t.toLowerCase().toCharArray();
            Arrays.sort(sorteds);
            Arrays.sort(sortedt);
            if (Arrays.equals(sorteds, sortedt)) {
                return true;
            }

        }
        return false;
    }
}

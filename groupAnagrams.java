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
        if(resultList.isEmpty()){

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


/*  

chat gpt final logic usng index in visited becaue my logic fails when same words repeat;

class Solution {

    private static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sorteds = s.toLowerCase().toCharArray();
        char[] sortedt = t.toLowerCase().toCharArray();

        Arrays.sort(sorteds);
        Arrays.sort(sortedt);

        return Arrays.equals(sorteds, sortedt);
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        boolean[] visited = new boolean[strs.length];
        List<List<String>> resultList = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {

            if (visited[i]) {
                continue;
            }

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {

                if (!visited[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            resultList.add(group);
        }

        return resultList;
    }
}

*/

/* 
Optimal solution from leet code 

import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] ch = word.toCharArray();               // Convert string to character array
            Arrays.sort(ch); 
            String key = new String(ch);                  // Create the sorted string (key)
            if (!map.containsKey(key)) {                  // If key doesn't exist, create a new list
                map.put(key, new ArrayList<>());
            }

            // Add the original word to its group
            map.get(key).add(word);
        }
        // Return all grouped anagrams
        
        return new ArrayList<>(map.values());
    }
}
*/

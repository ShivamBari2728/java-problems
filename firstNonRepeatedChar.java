/*

Find the first character that appears only once.

Input:  "swiss"
Output: 'w'
Input: "aabbcc"
Output: -1

*/

import java.util.*;
public class firstNonRepeatedChar {

    public static void main(String[] args) {
        String s = "swiss";
       HashMap<Character, Integer> charFreq = new HashMap<>();
        for(int i =0; i<s.length();i++){
            if(charFreq.containsKey(s.charAt(i))){
                charFreq.put(s.charAt(i),(charFreq.get(s.charAt(i)) + 1));
            }
            else{
                charFreq.put(s.charAt(i),1);
            }
        }
        System.out.println(charFreq);
        for(int i = 0;i<s.length();i++){
            if(charFreq.get(s.charAt(i))==1){
                System.out.println(s.charAt(i) + " is the non repeated char");
                break;
            }
        }
        System.out.println("-1");


    }
}
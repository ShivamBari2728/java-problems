//check if every word exist in the string form the arrey no word reused. 


public class wordBreak {
    public static void main(String[] args) {
        String orignalString = "leetcodecool";
        String[] words= {"leet","code","cool","hero"};
        int pointer =0 ;
        for(int i=0 ;i<words.length;i++){
        int startind = orignalString.substring(pointer).indexOf(words[i]);
        if(startind==-1){
            System.out.println("false");
        }
        if(startind>=0){
            System.out.println(pointer);
            pointer = pointer + startind + words[i].length();
        }
         }
         System.out.println("true");
        
    }
}

/* 
TODO: recursion. 
public class wordBreak {

    public static void main(String[] args) {

        String originalString = "leetcode";
        String[] words = {"leet", "code"};

        System.out.println(canBreak(originalString, words, 0));

    }

    public static boolean canBreak(String originalString, String[] words, int pointer) {

        // Reached end of string
        if (pointer == originalString.length()) {
            return true;
        }

        // Try every word
        for (int i = 0; i < words.length; i++) {

            // Check if current word starts exactly at pointer
            if (originalString.startsWith(words[i], pointer)) {

                // Move pointer forward
                if (canBreak(originalString, words, pointer + words[i].length())) {
                    return true;
                }
            }
        }

        return false;
    }
}

*/
import java.util.ArrayList;

class longestSubString{
    public static void main(String[] args) {
        String s = "pwwkew";
        int curr =0;
        ArrayList<Character> subStrings = new ArrayList<>(); 
        for (int i=0;i<s.length();i++){
            if(!subStrings.contains(s.charAt(i))){
                subStrings.add(s.charAt(i));
            }
            else{
                while(subStrings.contains(s.charAt(i)))
                {
                    subStrings.remove(0);
                }
                subStrings.add(s.charAt(i));
            }
            curr = max(curr,subStrings.size());
        }
                
        System.out.print(curr);
    }

    private static int max(int curr, int size) {
        if(curr<size){
            return size;
        }
        return curr;
    }
}
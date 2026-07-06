public class longestPalandromeSubString {

    public static boolean isPalandromefun(int start, int end, String s) {

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "babad";
        int curr = 0;
        String ans = "";

        for (int start = 0; start < s.length(); start++) {

            for (int end = start; end < s.length(); end++) {
           
                if (isPalandromefun(start, end, s)) {

                    int len = end - start + 1;

                    if (len > curr) {
                        curr = len;
                        ans = s.substring(start, end + 1);
                    }
                }
            }
        }

        System.out.println(curr);
        System.out.println(ans);
    }
}
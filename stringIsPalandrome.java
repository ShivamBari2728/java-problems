public class stringIsPalandrome {

    public static void main(String[] args) {
        String s = "abca";
        int start = 0;
        int end = s.length() - 1;
        System.out.print(isPalandromefun(start, end, s));

    }
    public static Boolean isPalandromefun(int start, int end, String s) {
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }
}

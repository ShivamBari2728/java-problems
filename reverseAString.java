class reverseAString{
    public static void main(String[] args) {
        String s = "hello";
        char[] chararr = s.toCharArray();
        int start =0;
        int end = chararr.length - 1;
        while (start<=end){
           char temp = chararr[start];
           chararr[start]=chararr[end];
           chararr[end] = temp;
           start ++;
           end --;
        }
        s = String.valueOf(chararr);
        System.out.println(s);

    }
}
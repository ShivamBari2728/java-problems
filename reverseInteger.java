/**
 * reverseInteger
 */
public class reverseInteger {

    public static void main(String[] args) {
        int a = -123;
        
        int reverse = 0;
        while(a!=0){
            int digit = a%10;
             if (reverse > Integer.MAX_VALUE / 10 ||
            (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
            return ; // return 0 
        }

        if (reverse < Integer.MIN_VALUE / 10 ||
            (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
            return ; // return 0 
        }
            reverse = reverse * 10 + digit;
            a = a/10;
            //System.out.println(digit);
        }
        System.out.println(reverse);
    }
}
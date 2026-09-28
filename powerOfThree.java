public class powerOfThree {
    public static void main(String[] args) {
        int a = 27;
        if (a == 1) {
            System.out.println(true);
            ;
        }
        double n = (double) a;

        int count = 0;
        while (n > 1) {
            n = n / 3;
            count++;
        }
        if (n == 1 && count > 0) {
            System.out.println("true and power is 3^" + count);

        } else {
            System.out.println(false);

        }
    }
}
// if the question is just find it is power of 3 or not then just do n%3 == 0  that means it is a power of 3. also hander case of n == 1;
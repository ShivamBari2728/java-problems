public class trapeziumPattern {
    public static void main(String[] args) {
        int n = 4;
        int numbersa = n;
        int startNumber = 1;
        int endNumberStarting = (n * 5) - n;
        int rightSideNumbers = endNumberStarting;
        int space = 0;
        for (int i = 1; i <= n; i++) {

            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numbersa; j++) {

                for (int k = i; k <= i; k++) {
                    System.out.print(startNumber + "*");
                    startNumber++;
                }

            }
            for (int l = numbersa - 1; l >= 0; l--) {
                rightSideNumbers = rightSideNumbers + 1;
                System.out.print(rightSideNumbers);
                if (l >= 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
            space++;
            numbersa--;
            endNumberStarting = endNumberStarting - numbersa;
            rightSideNumbers = endNumberStarting;

        }
    }
}
/* Output

1*2*3*4*17*18*19*20
 5*6*7*14*15*16
  8*9*12*13
   10*11

*/
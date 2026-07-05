class palindromeNumberPyramid {
    public static void main(String[] args) {

        /* 
        int n = 4;
        for (int i = 1; i <= n; i++) { // for rows

            for (int k = 1; k < i; k++) { // for asending numbers

                System.out.print(k);
            }

            for (int j = i; j <= i; j--) { // for decending numbers
                if (j > 0) {
                    System.out.print(j);
                } else {
                    break;
                }

            }
            System.out.println();


        }

        output of follwing code :
        1
        121
        12321
        1234321
        */




        int n = 4;
        int space = n;
        for (int i = 1; i <= n; i++) { // for rows

            for (int s = 1; s< space ; s ++){
                System.out.print(" ");
            }

            for (int k = 1; k < i; k++) { // for asending numbers

                System.out.print(k);
            }

            for (int j = i; j <= i; j--) { // for decending numbers
                if (j > 0) {
                    System.out.print(j);
                } else {
                    break;
                }

            }
            System.out.println();
            space -=1;


        }

        /*
           1
          121
         12321
        1234321
        */
    }
}
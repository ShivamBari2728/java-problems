/*
Input: n = 4

Output: 4

Explanation:

Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20
Hence, GCD(sumOdd, sumEven) = GCD(16, 20) = 4.

*/
public class GcdOfOddAndEvenSums {

    public static void main(String[] args) {
        int num = 4;
        int totalcount = 0;
        int i = 1;
        int oddSum = 0;
        int evenSum = 0;
        while (totalcount < num) {
            if (i % 2 != 0) {
                oddSum = oddSum + i;
                totalcount++;
            }
            i++;
        }
        totalcount = 0;
        i = 1;
        while (totalcount < num) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;
                totalcount++;
            }
            i++;
        }
        System.out.println(findGCD(oddSum, evenSum));
    }
    public static int findGCD(int firstNumber, int secondNumber) {
        int gcd = 0;
        int i = 1;
        while (i <= firstNumber || i <= secondNumber) {
            if ((firstNumber % i) == 0 && (secondNumber % i) == 0) {
                gcd = i;
            }
            i++;
        }
        System.out.println(gcd);
        return gcd;
    }
}
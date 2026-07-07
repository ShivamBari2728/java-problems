public class equilibriumIndex {
    public static int Sum(int start, int pointer, int[] arr) {
        int count = 0;
        while (start <= pointer) {
            count = count + arr[start];
            start++;
        }
        return count;
    }

    static int[] arr1 = { 1, 3, 5, 2, 2 };
    static int p1 = 0;

    public static void main(String[] args) {

        // my code 
        // if (arr1[p1] < Sum(0, arr1.length - 1, arr1)) {
        //     p1++;
        // }

        // while (Sum(0, p1 - 1, arr1) != Sum(p1 + 1, arr1.length - 1, arr1)) {
        //     p1++;
        // }
        // System.out.println("equalibriam at" + p1);


        // chat gpt code (better approch as some arrey may not have any Equilibrium)
        for (p1 = 0; p1 < arr1.length; p1++) {

            if (Sum(0, p1 - 1, arr1) == Sum(p1 + 1, arr1.length - 1, arr1)) {
                System.out.println("Equilibrium Index = " + p1);
                return;
            }

        }

        System.out.println("No Equilibrium Index");
    }
}

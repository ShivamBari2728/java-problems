import java.util.Arrays;

/**
 * removeCoveredIntervals
 */
public class removeCoveredIntervals {

    public static void main(String[] args) {

        int[][] arr = {
            {14041, 32641},
            {24914, 51477},
            {4983, 81235},
            {62018, 77987},
            {31523, 32192},
            {74196, 96194},
            {16126, 52652},
            {59901, 67707},
            {36502, 51366},
            {56437, 86744}
        };

        boolean[] deleted = new boolean[arr.length];

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if ((arr[i][0] >= arr[j][0]) &&
                    (arr[i][1] <= arr[j][1])) {

                    System.out.println("Interval " + i + " is covered by " + j);

                    deleted[i] = true;

                } else if ((arr[i][0] <= arr[j][0]) &&
                           (arr[i][1] >= arr[j][1])) {

                    System.out.println("Interval " + j + " is covered by " + i);

                    deleted[j] = true;
                }
            }
        }

        int intervals = 0;

        for (int i = 0; i < deleted.length; i++) {
            if (!deleted[i]) {
                intervals++;
            }
        }

        System.out.println("Remaining intervals = " + intervals);
        System.out.println(Arrays.toString(deleted));
    }
}
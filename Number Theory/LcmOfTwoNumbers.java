import java.util.ArrayList;

/**
 * LcmOfTwoNumbers
  Most optimal solution include using formula 

  LCM(a,b) = (a*b) / GCD(a,b)


 */
public class LcmOfTwoNumbers {

    public static int findLcm(ArrayList<Integer> multipleNum1, ArrayList<Integer> multipleNum2) {
        for (int j = 0; j < multipleNum1.size(); j++) {
            for (int k = 0; k < multipleNum2.size(); k++) {
                if (multipleNum1.get(j) < multipleNum2.get(k)) {
                    break;
                }
                if (multipleNum1.get(j) == multipleNum2.get(k)) {
                    return multipleNum1.get(j);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        int lcm = num1 * num2;
        ArrayList<Integer> multipleNum1 = new ArrayList<>();
        ArrayList<Integer> multipleNum2 = new ArrayList<>();
        int i = 1;
        while ((num1 * i) <= lcm) {
            multipleNum1.add(num1 * i);
            i++;
        }
        i = 1;
        while ((num2 * i) <= lcm) {
            multipleNum2.add(num2 * i);
            i++;
        }
        System.out.println(findLcm(multipleNum1, multipleNum2));
    }

}
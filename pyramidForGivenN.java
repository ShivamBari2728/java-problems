import java.util.Scanner; 

public class pyramidForGivenN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of lines : ");
        int input = sc.nextInt();
        int n = input;
        int stars = 1;
        for(int i = 1;i<=input;i++){ //loop foe number of lines

            for (int j = n ; j>0; j--){ // loop for " " it works in reverse as number of spaces reduces with the number of lines
                System.out.print(" ");
            }
            for (int s = 1;s<=stars;s++){ // loop for "*"
                System.out.print("*");
            }
            stars = stars + 2;
            n=n-1;
            System.out.println();
        }
    }
}
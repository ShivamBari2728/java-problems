import java.util.Scanner; 

public class invertedPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines :  ");
        int input = sc.nextInt();
        int n = 2 * input - 1;
        int space = 0;

            for(int i = 1;i<=input;i++){ //loop for number of lines

            // loop for spaces initially tere are 0 spaces and then 1 space at a time is added to each itteration .
            
            for (int s = 0 ;s<space;s++){ 
                System.out.print(" ");
            }
            for (int j = 1 ; j<=n; j++){ // loop to print * intially starts are 2*input-1 if user enters 9 then stars will be 17 and 2 stars are deducted in each itteration .
                System.out.print("*");
            }
          
            space = space + 1; 
            n=n-2;
            System.out.println();
        }
    }
}
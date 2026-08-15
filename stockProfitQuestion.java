/**
 * Best Time to Buy and Sell Stock
 * You are given stock prices where prices[i] represents the price on day i.
 * Find the maximum profit you can make by buying once and selling once.
 * 
 * Input:
 * [7,1,5,3,6,4]
 * 
 * Output:
 * 5
 * 
 * Buy at 1 and sell at 6.
 */
public class stockProfitQuestion {

    public static void main(String[] args) {
         int[] days = {7,1,5,3,6,4};
        int profit = 0;
        int buydate = days[0];
        int selldate = days[0];
       
        for(int i =0 ; i<days.length -1; i++){
            for (int j = i+1;j<days.length;j++){
                int profit2 = 0;
                profit2 = days[i] - days[j];
                if(profit2 < profit){
                    profit = profit2;
                    buydate = i+1;
                    selldate = j+1;
                }
            }
        }
        profit = Math.abs(profit);
        System.out.print("Profit of " + profit + " if you buy stock on day " + buydate + " and sell on day "+ selldate);
    }
}
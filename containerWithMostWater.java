/**
 * Given heights representing vertical lines, find two lines that together hold
 * the maximum amount of water.
 * 
 * Input:
 * [1,8,6,2,5,4,8,3,7]
 * 
 * Output:
 * 49 (area of the container)
 */
public class containerWithMostWater {

    public static void main(String[] args) {
        int[] container = {4, 3, 2, 1, 4};
        int largestArea = 0;
        int area =0;
        for(int i =0 ; i<container.length-1;i++){
            for(int j = i+1;j< container.length;j++){
                for(int k=i;k<=j;k++){
                    area = (j-i) * Math.min(container[j], container[i]);
                }
                System.out.println(area);
            }
            if(area>largestArea){
                largestArea=area;
            }
        }
        System.out.println("Largest area = "+largestArea);
    }
}
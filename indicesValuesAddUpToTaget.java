/**
 * Find two indices whose values add up to the target.
 * 
 * Input:
 * nums = [2,7,11,15]
 * target = 9
 * 
 * 
 * Output:
 * [0,1]
 */
public class indicesValuesAddUpToTaget {

    public static void main(String[] args) {
        int[] nums = {2,11,7,15,8,1};
        int target = 9;
        for(int i=0;i<nums.length -1;i++){
            if(nums[i] > target){
                continue;
            }
            for(int j = i+1 ; j<nums.length;j++){
                if(nums[j] > target){
                    continue;
                }
                if(
                    (nums[i] + nums [j]) == target
                ){
                    System.out.println("indexes are " + i +" "+j);
                }
            }
        }
    }
}
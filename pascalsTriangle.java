import java.util.ArrayList;
import  java.util.*;

/**
 *  
       1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
  1 5 10 10 5 1
 1 6 15 20 15 6 1

 */
public class pascalsTriangle {

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int row = 5;
        for(int i =0 ; i<row;i++){
            List<Integer> elemnets = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j==0 || j == i){
                    elemnets.add(j, 1);
                }else{
                    int sum = (result.get(i-1).get(j-1) ) + (result.get(i-1).get(j));
                    elemnets.add(j,sum);
                }
            }
            result.add(elemnets);
        }
        System.out.println(result);
    }
    
}
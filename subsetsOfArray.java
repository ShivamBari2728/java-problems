import java.util.ArrayList;

class subsetsOfArray{

    public static void generateSubSet(int[] arr , ArrayList<Integer> result ,int current){
        if(current == arr.length ){
            System.out.print(result);
            return;
        }

        result.add(arr[current]);
        generateSubSet( arr ,  result ,current +1);

        result.removeLast();

        int idx = current +1;
        while(idx < arr.length && arr[current] == arr[idx]){
            idx ++;
        } // if set has dublicate values. this step skips duplicate numbers.
        generateSubSet( arr ,  result ,idx);

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2};
        ArrayList<Integer> resuList = new ArrayList<>();
        generateSubSet(arr,resuList,0);

    }
}
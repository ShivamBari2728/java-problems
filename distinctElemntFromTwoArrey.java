// 28. Given two arrays, print all distinct elements from both + total count.

import java.util.HashSet;

public class distinctElemntFromTwoArrey {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        int[] arr1 = {1,5,7,9};
        int[] arr2 = {5,4,3,9};
        int total =0;
        for( int i :arr1){
            hashSet.add(i);
        }
        for ( int j : arr2){
            hashSet.add(j);
        }
        System.out.println(hashSet.toString());
        for(int k : hashSet){
            total = total + k;
        }
        System.out.println(total);

    }
}

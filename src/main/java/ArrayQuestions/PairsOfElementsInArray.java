package ArrayQuestions;

import java.util.ArrayList;
import java.util.List;

public class PairsOfElementsInArray {

//    Find all pairs of elements in an integer array whose sum is equal to a given number?

    public static void main(String[] args) {
        findThePairs(new int[]{4, 6, 5, -10, 8, 5, 20}, 10);
        findThePairs(new int[]{4, -5, 9, 11, 25, 13, 12, 8}, 20);
        findThePairs(new int[]{12, 13, 10, 15, 8, 40, -15}, 25);
        findThePairs(new int[]{12, 23, 10, 41, 15, 38, 27}, 50);
    }

    private static void findThePairs(int[] a, int sum){
        List<Integer> pairs = new ArrayList<>();
        for(int i=0; i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]+a[j]==sum){
                    pairs.add(a[i]);
                    pairs.add(a[j]);
                }
            }
        }
        System.out.println(pairs);
    }
}

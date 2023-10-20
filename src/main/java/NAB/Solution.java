package NAB;

// Q. Write a java function solution that given an array on N integers, returns largest K > 0 such that both values K and
// -K(the opposite number) exist in array A. If there is no such integer the function should return 0.
//Improve this algorithm with following assumptions
//1. N is an integer within the range [1..100,000];
//2. Each element of array A is an integer with in the range [-1,000,000,000...1,000,000,000];

// you can also use imports, for example:
// import java.util.*;
import java.util.HashMap;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    // public static void main(String[] args){
    //    int answer = solution(A[]);
    //    System.out.println(answer);
    // }
    public int solution(int[] A) {
        // Implement your solution here
        if (A.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], i);
        }
        int largestK = 0;
        for (Integer key : map.keySet()) {
            if (key > 0 && map.containsKey(-key)) {
                largestK = Math.max(largestK, key);
            }
        }

        return largestK;
    }
}

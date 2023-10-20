package NAB;

import java.util.*;
//Given integer array A[] with distinct elements. Find max number of slices in which array can be divided, so that if all slices are combined, we get a complete sorted array. Each slice need to be sorted individually, and then these sorted slices should be combined.
//        Ex1. A=[2,4,1,6,5,9,7]. Ret val = 3. slices[2,4,1], [6,5], [9,7]
//        Ex2. A=[4,3,2,6,1]. Ret val =1. Array cannot be sliced.
//        Ex3. A=[2,1,6,4,3,7] Ret val =3. slices [2,1], [6,4,3],[7]
//
//        What logic can be used here to slice the arrays?
public class Large {

        public int solution(int[] A) {
            int n = A.length;
            List<Integer> pos = new ArrayList<>();
            for(int i=0; i<n; i++){
                pos.add(i);
            }
            Collections.sort(pos, (x,y)->A[x]-A[y]);
            int max = 0, ans = 0;
            for(int i=0; i<n; i++) {
                max = Math.max(pos.get(i), max);
                if(max==i) ans++;
            }
            return ans;
        }

}

package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumExtraStars {

    public static int minStarsRequired(int N, int[] A) {
        // Sort the array in ascending order
        Arrays.sort(A);

        int minStars = 0;

        // Iterate through the sorted array
        for (int i = 0; i < N; i++) {
            // Check if the desired rank (i + 1) is greater than the current number of stars
            if (i + 1 > A[i]) {
                // Add the required extra stars to the current badge
                minStars += (i + 1 - A[i]);
            }
        }

        return minStars;
    }

        public static void main(String[] args) {
            int N = 4;
            int[] stars = { 1, 1, 1, 4};
            int result = minStarsRequired(N, stars);
            System.out.println("Minimum number of extra stars required: " + result);
        }
}

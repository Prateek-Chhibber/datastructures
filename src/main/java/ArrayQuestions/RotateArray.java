package ArrayQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArray {

    public static void rotate(int[] nums, int k){
        // Reverse the whole array
        for (int start = 0, end = nums.length - 1; start < end; start++, end--) {
            // Swap elements at positions 'start' and 'end'
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1);
        System.out.println("Test case 1: Rotated array: " + Arrays.toString(nums1));  // prints "Rotated array: [5, 6, 7, 1, 2, 3, 4]"

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2);
        System.out.println("Test case 2: Rotated array: " + Arrays.toString(nums2));  // prints "Rotated array: [3, 99, -1, -100]"
    }
}

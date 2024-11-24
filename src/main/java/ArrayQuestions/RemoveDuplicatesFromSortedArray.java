package ArrayQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int count = removeDuplicates(nums);
        System.out.println(count);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int k = 1;
        int count = 1;
        for (int i = 1; i< nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;  // Same as the previous element, so increment count
            } else {
                count = 1;  // Reset count for a new element
            }
            System.out.println(nums[i]);
            // Only allow up to 2 occurrences of the same element
            if (count <= 2) {
                nums[k] = nums[i];  // Place the current element at position k
                System.out.println(nums[k]);
                k++;  // Move the pointer to the next position for the valid element
            }
        }
       return k;
    }
}

package hashmap;

import java.util.HashMap;

//Check Duplicate numbers in an array
public class PracticeHashmap {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,1};
        containsDuplicate(nums);

    }

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x=0; x<nums.length;x++){
            if(map.containsKey(nums[x]) ){
                return true;
            }
            else map.put(nums[x],x);
        }
        return false;

    }
}

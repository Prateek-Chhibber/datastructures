package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] numbers) {
        int length = numbers.length;
        int number = numbers[0];
        System.out.println(Arrays.stream(numbers).sorted());
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(number);
        if(length>0){
            for(int n: numbers){
//                System.out.println("numbers : "+n);
                if(number!=n){
                    arrayList.add(n);
//                    System.out.println("Size of ArrayList is : "+arrayList.size());
                }
                number = n;
            }
            length = arrayList.size();
        }
        System.out.println(Arrays.deepToString(arrayList.toArray()));
        return length;
    }

    public static int removeDup(int[] numbers) {
        int length = numbers.length;
        if (length>0){
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            for(int num: numbers) {
                hashMap.put(num,num);
            }
            length = hashMap.size();
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            return length;
        }
        return length;
    }

    public static void main(String[] args) {

        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("Test case 1: New length: " + newLength1);
        System.out.println("Test case 1: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, 5)));

        int[] nums2 = {1, 1, 2};
        int newLength2 = removeDup(nums2);
        System.out.println("Test case 2: New length: " + newLength2);
        System.out.println("Test case 2: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2)));

//        int[] nums3 = {-1, 0, 0, 0, 3, 3};
//        int newLength3 = removeDuplicates(nums3);
//        System.out.println("Test case 3: New length: " + newLength3);
//        System.out.println("Test case 3: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3)));
//
//        int[] nums4 = {};
//        int newLength4 = removeDuplicates(nums4);
//        System.out.println("Test case 4: New length: " + newLength4);
//        System.out.println("Test case 4: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, newLength4)));
//
//        int[] nums5 = {1, 1, 1, 1, 1};
//        int newLength5 = removeDuplicates(nums5);
//        System.out.println("Test case 5: New length: " + newLength5);
//        System.out.println("Test case 5: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, newLength5)));

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: New length: 5
            Test case 1: Unique values in list: [0, 1, 2, 3, 4]
            Test case 2: New length: 2
            Test case 2: Unique values in list: [1, 2]
            Test case 3: New length: 3
            Test case 3: Unique values in list: [-1, 0, 3]
            Test case 4: New length: 0
            Test case 4: Unique values in list: []
            Test case 5: New length: 1
            Test case 5: Unique values in list: [1]
        */

    }
}

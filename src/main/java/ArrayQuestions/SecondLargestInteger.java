package ArrayQuestions;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestInteger {

//    Find 2nd Largest integer in array of integers

    private static void sortByAscOrder(Integer[] inputArray){
        if(inputArray.length>1){
            Arrays.sort(inputArray);
            System.out.println("2nd Largest Element of array is : "+inputArray[inputArray.length-2]);
        } else {
            System.out.println("Empty array!!");
        }
    }

    private static void sortByDescOrder(Integer[] inputArray){
        if(inputArray.length >1){
            Arrays.sort(inputArray, Collections.reverseOrder());
            System.out.println("2nd highest element is : "+Arrays.asList(inputArray).get(1));
        } else {
            System.out.println("Empty array!!");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {100,203,110,99,87,500,234,563,999,251};
        sortByAscOrder(arr);
        sortByDescOrder(arr);
    }
}

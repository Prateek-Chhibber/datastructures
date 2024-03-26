package ArrayQuestions;

import java.util.Arrays;
import java.util.OptionalInt;

public class SumOfAllElements {

    public static void main(String[] args) {
        int[] arr = {80,10,20,30,40};
        int sum = Arrays.stream(arr).sum();
        OptionalInt largestElementOfArray = Arrays.stream(arr).max();
        System.out.println("Sum of all Elements of Array is : "+sum);
        System.out.println("Largest number in array : "+largestElementOfArray);
    }
}

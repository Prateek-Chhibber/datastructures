package ArrayQuestions;

import java.util.Arrays;

public class MinimumMaximumInArray {
    public static void main(String[] args) {
        int[] myList = {5, 3, 8, 1, 6, 9};
        int min = myList[0];
        System.out.println(Arrays.stream(myList).max().toString());
        System.out.println(Arrays.toString(myList));
    }
}

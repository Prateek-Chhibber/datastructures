package ArrayQuestions;

import java.util.Arrays;

public class EqualityOfTwoArrays {

    //    Check Equality of two arrays
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {10, 20, 30, 40};
        int[] array3 = {20, 10, 30, 40};
//        compareArrays(array1, array2);
//        compareArrayByEquals(array1, array3);
        compareTwoArrays(array1, array3);
        compTwoArrays(array2, array3);
    }

    private static void compareArrays(int[] a, int[] b) {
        int flag = Arrays.compare(a, b);
        if (flag == 0) {
            System.out.println("Both the arrays are equal");
        } else if (flag < 0) {
            System.out.println("First array is lexicographically less than the second array");
        } else {
            System.out.println("First array is lexicographically greater than the second array");
        }
    }

    private static void compareArrayByEquals(int[] a, int[] b) {
        System.out.println("Both arrays are equal : " + Arrays.equals(a, b));
    }

    private static void compareTwoArrays(int[] a, int[] b) {
        int sizeOfFistArray = a.length;
        int sizeOfSecondArray = b.length;
        boolean flag = false;
        if (sizeOfFistArray != sizeOfSecondArray) {
            System.out.println("Both array are in equal and cannot be compared");
        } else {
            for (int i = 0; i < sizeOfFistArray; i++) {
                for (int j = 0; j < sizeOfSecondArray; j++) {
                    if (a[i] == b[j]) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }
            }
            if (!flag) {
                System.out.println("Both the arrays are same");
            } else {
                System.out.println("Both arrays are different");
            }
        }
    }

    private static void compTwoArrays(int[] a, int[] b) {
        boolean equalOrNot = true;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            equalOrNot = false;
        }

        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        } else {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}

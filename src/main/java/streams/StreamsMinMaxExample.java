package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMinMaxValue(List<Integer> integerList) {
        int result = integerList.stream()
                .reduce(0, (x,y)-> x>y ? x : y);
        return result;
    }

    public static Optional<Integer> findMinMaxValueOptional(List<Integer> integerList) {
        Optional<Integer> result = integerList.stream()
                .reduce((x,y)-> x>y ? x : y);
        return result;
    }

    public static void main(String[] args) {
//        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        List<Integer> integerList = new ArrayList<>();
        int result = findMinMaxValue(integerList);
        System.out.println(findMinMaxValue(integerList));

        Optional<Integer> result1 = findMinMaxValueOptional(integerList);
        if (result1.isPresent()) {
            System.out.println("max value is : " + result1.get());
        }

    }
}

package Declarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

    public static void main(String[] args) {

        //Remove the duplicates from the list.

//        Imperative Style of Programming - How to
        List<Integer> integerList = Arrays.asList(1,2,1,0,2,3,1,3,4,2,6,7,8,4,5,7,9,8,6);
        List<Integer> uniqueList = new ArrayList<>();

        for(Integer integer : integerList){
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        System.out.println("uniqueList : "+uniqueList);

//        Declarative Style of Programming - What to
        List<Integer> uniqueList1 = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println("uniqueList1 : "+uniqueList1);
    }
}

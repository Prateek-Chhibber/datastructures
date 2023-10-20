package ArrayQuestions;

import java.util.HashMap;

public class FindWordCountInAString {

    public static void main(String[] args) {
        String input = "java developers guide";

        int count = 0;

        for(String word : input.split(" ")){
            count++;
        }
        System.out.println("Numbers of word in the String are : "+count);
    }
}

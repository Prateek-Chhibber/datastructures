package ArrayQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {
        String original = "  hello world  ";
        String reverse = reverseWordsOfString(original);
        System.out.println(reverse);
//        char ch[] = original.toCharArray();
//        for(int i=ch.length-1;i>=0;i--){
//            reverse += ch[i];
//        }
//        System.out.println(reverse);

    }

    public static String reverseWords(String original) {
        String reverse = null;
        String[] words = original.split("\\s");
        List<String> listOfWords = new ArrayList<>();
        for(String w : words){
           listOfWords.add(w);
        }
        listOfWords.removeAll(Collections.singleton(""));
        Collections.reverse(listOfWords);
        reverse = String.join(" ", listOfWords);
        return reverse;
    }

    public static String reverseWordsOfString(String s) {
        // Step 1: Trim leading and trailing spaces
        s = s.trim();

        // Step 2: Split the string by spaces. This automatically removes extra spaces.
        String[] words = s.split("\\s+");

        // Step 3: Reverse the order of words
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");  // Add a space between words
            }
        }

        return result.toString();
    }
}

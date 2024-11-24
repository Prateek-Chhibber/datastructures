package String;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class UniqueCharacter {
    public static void main(String[] args) {
        List<Character> uniqueCharacters = countUniqueCharacters("aabaabcdzcdabcd");
        System.out.println("Unique characters with count 1:");
        for (char c : uniqueCharacters) {
            System.out.println(c);  // Print each character separately
        }
    }

    public static List<Character> countUniqueCharacters(String input){
        List<Character> uniqueCharacterList = new ArrayList<>();
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        // First pass: Count occurrences of each character
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        // Second pass: Collect all keys with a count of 1 directly during counting
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) == 1) {
                uniqueCharacterList.add(c);
            }
        }
        return uniqueCharacterList;
    }
}

package HackerRank;

import java.util.HashMap;

import java.util.Set;

public class Anagram {
    //using HashMaps
    public static void main(String[] args) {

        String word = "anagramm";
        String word1 = "marganaa";
        if (isAnagram(word, word1))
            System.out.println("The two Strings are anagrams of each other");

        else
            System.out.println("The strings are not anagram  of each other");


}
    private static boolean isAnagram(String a, String b) {
        //check if length of the string is the same
        if (a.length() != b.length()) {
            return false;
        }
        //initializing map
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            // check if hashMap contain current characters or not
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            } else {
                map.put(a.charAt(i), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
            } else {
                return false;
            }
        }


        Set<Character> keys = map.keySet();
        //loop through to check if all keys are 0, if so, it is an anagram
        for(Character key : keys){
            if (map.get(key) !=  0){
                return false;
            }
        }
        return true;
    }
}
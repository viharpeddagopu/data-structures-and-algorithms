package Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] alphabets = new int[26];

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i) - 'a']--;
        }

        for (int num : alphabets) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "carrace";

        if (isAnagram(s1, s2))
            System.out.println("the strings are valid anagrams");
    }
}

//brute force: sort the 2 strings, if the strings are equal -> anagram

//better solution using hashmap
//      create 2 frequency counting hashmaps for 2 strings and compare them

//best approach using arrays
//      create an array of size 26, for first string, increment frequency for each character by 1
//      then, for 2nd string, decrement frequency by 1 for each character
//      if the final array has all 0s, then they are valid anagrams
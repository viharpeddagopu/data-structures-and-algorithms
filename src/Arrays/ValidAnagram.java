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

package SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t){
        if (t.isEmpty())
            return "";
        if (t.length() > s.length())
            return "";

        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        //add frequencies of the elements of t to the countT hashmap
        for (char c : t.toCharArray()){
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        //creating have and need for the windows to eliminate the entire hashmap iteration
        int have = 0, need = countT.size();
        int left = 0;

        //indices for the result string
        int start = 0, minLen = Integer.MAX_VALUE;

        //iterate the window
        for (int right = 0; right < s.length(); right++){
            //add char at c to the window
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c,0) + 1);

            //if 1 character satisfies the have completely -> means present in t and freq is same as in t
            if (countT.containsKey(c) && window.get(c).intValue() == countT.get(c).intValue())
                have++;

            //valid window, when have = need
            while(have == need){

                //update the result substring to get the min length
                if ((right - left + 1) < minLen){
                    minLen = right - left + 1;
                    start = left;
                }

                //removing the left character and reducing the window size
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                //window becomes invalid if leftChar is present in countT and frequency is less than needed
                if (countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar))
                    have--;

                left++;
            }
        }
        return minLen == Integer.MAX_VALUE? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(
                minWindow(s, t)
        );
    }
}

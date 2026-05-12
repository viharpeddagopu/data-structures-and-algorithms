package SlidingWindow;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String str, int k){
        int[] alphabetFreq = new int[26];
        int left = 0, right =0;
        int maxFreq = 0, result = 0;

        while(right < str.length()){
            char current = str.charAt(right);
            alphabetFreq[current - 'A']++;

            maxFreq = Math.max(maxFreq, alphabetFreq[current - 'A']);

            while((right - left + 1) - maxFreq > k){ //invalid window ---> shrink the size
                alphabetFreq[str.charAt(left) - 'A']--;

                left++;
            }

            result = Math.max(result, right - left + 1);

            right++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }
}

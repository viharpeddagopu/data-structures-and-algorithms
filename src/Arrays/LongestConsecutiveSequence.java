package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestSequence(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        // Add elements to set
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        // Iterate through unique elements
        for (int num : set) {
            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                // Expand forward
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        int result = longestSequence(arr);

        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}
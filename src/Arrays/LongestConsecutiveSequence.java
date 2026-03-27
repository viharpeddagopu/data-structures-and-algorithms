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

//brute force: sort the array

//better approach
        //convert the array into a set
        //find the start element of the sequence -> by checking if there exists an element on the left side of that number in the number line
        //after finding the start elements, find the length of the sequence by checking if there are any numbers present after that element
        //return the sequence with the longest length
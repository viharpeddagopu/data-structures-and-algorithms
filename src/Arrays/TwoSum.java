package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSumIndices(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (map.containsKey(difference))
                return new int[]{map.get(difference), i};

            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,7};
        int[] result = twoSumIndices(nums, 7);

        System.out.println(result[0] + " " + result[1]);
    }
}

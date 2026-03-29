package SlidingWindow;

public class MaximumSumSubarray {
    public static int maximumSumOfSubarray(int[] nums, int k){
        int sum = 0, maxSum;

        // initial window: sum
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        maxSum = sum;

        int left = 0;
        // slide window
        for(int right = k; right < nums.length; right++){
            sum = sum + nums[right] - nums[left];
            left++;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
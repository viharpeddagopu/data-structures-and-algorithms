package TwoPointers;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices){
        int left = 0, right = 1;
        int maxProfit = 0, profit;

        while(right < prices.length){
            if (prices[right] > prices[left]){
                profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            }
            else
                left = right;
            right++;
        }
        return maxProfit;
    }
}

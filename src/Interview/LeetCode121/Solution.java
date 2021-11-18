package Interview.LeetCode121;

public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > max) { // 当天价格大于最小价格 买出
                max = prices[i] - minPrice;
            }
        }
        return max;
    }
}

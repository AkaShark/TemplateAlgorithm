package Offer.offer42;

public class Solution {
    // dp数组解决
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] > 0) { // 如果dp[i - 1] > 0 + nums[i] 大于 dp[i - 1] < 0 + nums[i] 小于 0 + nums[i]
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}

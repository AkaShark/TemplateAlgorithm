package Offer.offer42;

public class Solution3 {
    public int maxSubArray(int[] nums) {
        int preSum = 0;
        int minSum = 0;
        int maxSbuSum = Integer.MIN_VALUE;
        for (int num : nums) {
            preSum += num;
            maxSbuSum = Math.max(maxSbuSum, preSum - minSum);
            minSum = Math.min(minSum, preSum);
        }
        return maxSbuSum;
    }
}

package Offer.offer42;

public class Solution2 {
    public int maxSubArray(int[] nums) {
        int preMax = nums[0];
        int curMax = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            preMax = curMax;
            curMax = Math.max(nums[i] + preMax, nums[i]);
            max = Math.max(max, curMax);
        }
        return max;
    }
}

package ReviewOffer.offer42;

public class Solution1 {
    public int maxSubArray(int[] nums) {
        int preSum = 0;
        int min = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i]; // 前缀和
            ans = Math.max(preSum - min, ans);
            if (preSum < min) {
                min = preSum;
            }
        }
        return ans;
    }
}

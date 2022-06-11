package Offer.offer42;

public class Solution4 {
    public int maxSubArray(int[] nums) {
        int min = 0; // 记录前缀和中的小值
        int ans = Integer.MIN_VALUE; // 结果
        int num = 0; // 前缀和
        for (int i = 0; i < nums.length; i++) {
            num += nums[i];
            ans = Math.max(num - min, ans);
            if (num < min) {
                min = num;
            }
        }
        return ans;
    }
}

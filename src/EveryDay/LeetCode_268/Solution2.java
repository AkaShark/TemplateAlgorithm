package EveryDay.LeetCode_268;

public class Solution2 {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        for (int i = 0; i <= nums.length; i++) {
            ans ^= i;
        }
        return ans;
    }
}

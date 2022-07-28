package AlgorithmBased.LeetCode_713;

import java.util.List;

public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int start = 0, end = 0;
        int ans = 0;
        while (start < nums.length) {
            if (subarraySum(nums, start, end) < k) {
                ans ++;
                end ++;
            } else {
                start ++;
                end = start;
            }

            if (end == nums.length) {
                start ++;
                end = start;
            }
        }
        return ans;
    }
    private int subarraySum(int[] nums, int left, int right) {
        int sum = 1;
        for (int i = left; i <= right && i < nums.length; i++) {
            sum *= nums[i];
        }
        return sum;
    }
}

package AlgorithmBased.LeetCode_713;

public class Solution1 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int sum = 1, ans = 0;
        int start = 0, end = 0;
        while (start < nums.length) {
            sum *= nums[end];
            if (sum < k) {
                ans ++;
                end ++;
            } else {
                sum /= nums[end];
                sum /= nums[start];
                start ++;
                end = start;
            }
            if (end == nums.length) {
                sum /= nums[end];
                sum /= nums[start];
                start ++;
                end = start;
            }
        }
        return ans;
    }
}

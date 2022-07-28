package AlgorithmBased.LeetCode_713;

public class Solution2 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length;
        if (len == 0) return 0;
        int ret = 0;
        int sum = 1, start = 0;
        for (int end = 0; end < len; end++) {
            sum *= nums[end];
            while (start <= end && sum >= k) {
                sum /= nums[start];
                start ++;
            }
            ret += end - start + 1;
        }
        return ret;
    }
}

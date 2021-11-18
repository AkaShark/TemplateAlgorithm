package Interview.LeetCode209;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution1 {
    static public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < nums.length) {
            sum += nums[end];
            while (sum >= target) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start ++; // 收缩左边界
            }
            end ++; // 扩张右边界
        }
        return ans == Integer.MAX_VALUE? 0: ans;
    }

    public static void main(String[] args) {
        minSubArrayLen(4, new int[]{1,4,4});

    }
}

package AlgorithmBased.LeetCode_209;

public class Solution1 {
   static public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int ans = Integer.MAX_VALUE, start = 0, sum = 0;
        for (int end = 0; end < len; end++) {
            sum += nums[end];
            while (sum >= target) {
                ans = Math.min(ans, (end - start + 1));
                sum -= nums[start];
                start ++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(15, new int[]{1,2,3,4,5}));
    }
}

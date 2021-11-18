package Interview.LeetCode209;

public class Solution {
    // 超时了 O(n2)
    static public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return 1;
            for (int j = i + 1; j < nums.length ; j++) {
                if (sum(nums, i, j) >= target) {
                    minLength = Math.min(minLength, j - i + 1);
                    break;
                }
            }
        }
        return minLength == Integer.MAX_VALUE? 0: minLength;
    }

    static public int sum(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        minSubArrayLen(4, new int[]{1,4,4});
    }
}

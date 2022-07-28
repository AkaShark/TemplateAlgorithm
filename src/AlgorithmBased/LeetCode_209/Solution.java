package AlgorithmBased.LeetCode_209;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    static public int minSubArrayLen(int target, int[] nums) {
        Deque<Integer> deque = new ArrayDeque<>();
        int sum = 0, ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            deque.offer(nums[i]);
            sum += nums[i];
            if (sum >= target) {
                while (sum >= target && deque.size() > 0) {
                    ans = Math.min(ans, deque.size());
                    sum -= deque.poll();
                }
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        minSubArrayLen(15, new int[]{1,2,3,4,5});
    }
}
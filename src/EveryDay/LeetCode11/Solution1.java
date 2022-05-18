package EveryDay.LeetCode11;

public class Solution1 {
    // LeetCode 优秀代码
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            int min = Math.min(height[l], height[r]);

            int temp = min * (r - l);

            max = Math.max(max, temp);

            // 快速跳过 高度比min还小的直接跳过 只找更大的
            while (height[l] <= min && l < r) {
                ++l;
            }

            while (height[r] <= min && l < r) {
                --r;
            }
        }
        return max;
    }
}

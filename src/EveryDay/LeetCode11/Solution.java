package EveryDay.LeetCode11;

public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        while (left < right) {
            int width = right - left;
            int temp;
            if (height[left] > height[right]) {
                temp = width * height[right];
                right--;
            } else {
                temp = width * height[left];
                left++;
            }
            if (temp > ans) {
                ans = temp;
            }
        }
        return ans;
    }
}

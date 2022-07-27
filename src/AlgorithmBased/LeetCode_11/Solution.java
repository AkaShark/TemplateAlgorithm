package AlgorithmBased.LeetCode_11;

public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int sum = (right - left) * Math.min(height[left], height[right]);
            if (height[left] > height[right]) {
                right --;
            } else {
                left ++;
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
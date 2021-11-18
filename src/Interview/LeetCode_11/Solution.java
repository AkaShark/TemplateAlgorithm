package Interview.LeetCode_11;

public class Solution {
    public int maxArea(int[] height) {
       int left = 0, right = height.length - 1;
       int max = Integer.MIN_VALUE;
       while (right > left) {
           int area = Math.min(height[left], height[right]) * (right - left);
           if (area > max) {
               max = area;
           }
           if (height[left] <= height[right]) {
               left ++;
           } else {
               right --;
           }
       }
       return max;
    }
}

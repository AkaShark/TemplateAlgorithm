package camp.LeetCode_34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};
        int left = 0, right = nums.length - 1;
        int start = -1, end = -1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] == target) start = left;

        int left_1 = 0, right_1 = nums.length - 1;
        while (left_1 < right_1) {
            int mid = (right_1 - left_1 + 1) / 2 + left_1;
            if (nums[mid] > target) {
                right_1 = mid - 1;
            } else {
                left_1 = mid;
            }
        }
        if (nums[left_1] == target) end = left_1;
        return new int[]{start, end};
    }

}

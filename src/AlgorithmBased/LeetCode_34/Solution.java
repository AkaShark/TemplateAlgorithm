package AlgorithmBased.LeetCode_34;

public class Solution {
    // 找左边 nums[mid] < target nums[mid] > target
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{};
        int start = searchStart(nums, target);
        int end = searchEnd(nums, target);
        if (start == -1 || end == -1) return new int[]{};
        return new int[]{start, end};
    }

    private int searchStart(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] == target) return left;
        return -1;
    }

    private int searchEnd(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        if (nums[left] == target) return left;
        return -1;
    }
}
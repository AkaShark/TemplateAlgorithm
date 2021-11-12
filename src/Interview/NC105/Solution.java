package Interview.NC105;

public class Solution {
    public int search (int[] nums, int target) {
        // 控制作用区间
        int left = 0, right = nums.length - 1;
        while (right >= left) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        // 最后检查下
        if (left >= nums.length || nums[left] != target) return -1;
        return left;
    }
}

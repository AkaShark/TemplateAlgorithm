package Interview.LeetCode_33;

public class Solution1 {
    // 二分法解决 时间复杂度O(logn)
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0] == target? 0: -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= nums[0]) { // 左边有序
                if (nums[0] <= target && target < nums[mid]) { // 在左边的范围
                    right = mid - 1;
                } else { // 右边范围
                    left = mid + 1;
                }
            } else { // 右边有序
                if (nums[mid] < target && target <= nums[nums.length - 1]) { // 右边范围
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

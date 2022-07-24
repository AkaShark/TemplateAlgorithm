package AlgorithmBased.LeetCode_33;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums != null && nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
        while (right >= left) {
            int mid = (right - left ) / 2 + left;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= nums[left]) { // 左边有序
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

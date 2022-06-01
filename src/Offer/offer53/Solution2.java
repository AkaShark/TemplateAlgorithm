package Offer.offer53;

public class Solution2 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int start = findFirst(nums, target);
        if (start == -1) {
            return 0;
        }
        int end = findLast(nums, target);
        return end - start + 1;
    }

    public int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }

    public int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left;
    }
}

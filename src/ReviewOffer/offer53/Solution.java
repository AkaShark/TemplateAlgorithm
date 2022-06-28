package ReviewOffer.offer53;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        int start = findStartIndex(nums, target);
        if (nums[start] != target) return 0;
        int end = findEndIndex(nums, target);
        return end - start + 1;
    }

    public int findStartIndex(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (right > left) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int findEndIndex (int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (right > left) {
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

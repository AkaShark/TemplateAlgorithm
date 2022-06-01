package Offer.offer53;

public class Solution1 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] != target) return 0; // 不存在
        int start = left, end = left;
        while (nums[end] == target) {
            end ++;
        }
        return end - start;
    }
}

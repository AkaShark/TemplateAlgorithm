package AlgorithmBased.LeetCode_153;

public class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < nums[right]) { // 最小值在左边
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}

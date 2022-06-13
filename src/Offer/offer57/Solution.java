package Offer.offer57;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (right > left) {
            if (nums[left] + nums[right] < target) {
                left ++;
            } else if (nums[left] + nums[right] > target) {
                right --;
            } else {
                return new int[]{nums[left], nums[right]};
            }
        }
        return new int[]{};
    }
}

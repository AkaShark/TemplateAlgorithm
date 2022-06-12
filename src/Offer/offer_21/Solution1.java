package Offer.offer_21;

public class Solution1 {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while (left < right && (nums[left] & 1) == 1) left ++;
            while (left < right && (nums[left] & 1) == 0) right --;
            // left 为偶数 right为奇数 swap
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}

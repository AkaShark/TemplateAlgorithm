package Offer.offer_2_09;

public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int ret = 0;
        int total = 1;
        for (int right = 0; right < nums.length; right ++) {
            total *= nums[right];
            while (left <= right && total >= k) {
                total /= nums[left ++];
            }
            if (left <= right) {
                ret += right - left + 1; // left 到 right 子集的个数
            }
        }
        return ret;
    }

}

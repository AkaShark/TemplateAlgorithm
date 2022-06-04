package Offer.offer53_2;

public class Solution1 {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (right > left) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] != mid) {
                right = mid;
            } else {
                left = mid + 1; // 二分法 左边满足条件 直接缩减问题规模到右侧 [mid+1, right)
            }
        }
        return nums[left] == left ? left + 1 : left; // 最后一位和第一位缺失补充
    }
}

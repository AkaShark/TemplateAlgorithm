package Offer.offer53_2;

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int n = nums.length + 1;
        int targetSum = (0 + n - 1) * n / 2;
        return targetSum - sum;
    }
}

package EveryDay.LeetCode_268;

public class Solution3 {
    public int missingNumber(int[] nums) {
        int numsSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
        }
        int targetSum = 0;
        for (int i = 0; i <= nums.length; i++) {
            targetSum += i;
        }
       return targetSum - numsSum;
    }
}

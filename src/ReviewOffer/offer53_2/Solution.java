package ReviewOffer.offer53_2;

public class Solution {
    // 0 1 3
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int targetSum = ((0 + nums.length) * (nums.length + 1)) / 2;
        return targetSum - sum;
    }


}

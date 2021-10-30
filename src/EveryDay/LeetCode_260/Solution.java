package EveryDay.LeetCode_260;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int tem = 0;
        for (int num: nums) {
            tem ^= num;
        }
        int ans = tem == Integer.MIN_VALUE? tem: tem & (-tem);
        int type1 = 0, type2 = 0;
        for (int num : nums) {
            if ((num & ans) != 0) {
                type1 ^= num;
            } else {
                type2 ^= num;
            }
        }
        return new int[]{type1, type2};
    }
}

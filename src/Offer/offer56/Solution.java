package Offer.offer56;

public class Solution {
    public int[] singleNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num; // 求 两个不同数的异或
        }
        
        // 取两个数异或结果中的为1的位
        int div = 1;
        while ((div & ans) == 0) {
            div <<= 1; // 取为1的最低位
        }

        // 根据div区分数组中的每个数 分组
        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & div) == 1) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}

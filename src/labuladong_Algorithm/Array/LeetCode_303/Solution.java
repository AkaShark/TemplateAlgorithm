package labuladong_Algorithm.Array.LeetCode_303;

import java.util.ArrayList;

class NumArray {
    private int[] preNum = null;
    public NumArray(int[] nums) {
        preNum = new int[nums.length + 1];
        for (int i = 1; i < preNum.length; i++) {
            preNum[i] = preNum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return preNum[right + 1] - preNum[left];
    }
}

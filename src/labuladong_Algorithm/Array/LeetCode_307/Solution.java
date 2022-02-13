package labuladong_Algorithm.Array.LeetCode_307;

class NumArray {
    private int[] preSum;
    private int[] originNum;
    public NumArray(int[] nums) {
        assert nums.length > 0;
        originNum = nums;
        preSum = new int[nums.length + 1];
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
    }

    public void update(int index, int val) {
        int gap = originNum[index] - val;
        // O(n)
        for (int i = index + 1; i < preSum.length; i++) {
            preSum[i] -= gap;
        }
    }

    public int sumRange(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }
}

package Interview.LeetCode_189;

public class Solution {
    // 环形数组 原地替换
    public void rotate(int[] nums, int k) {
        int len = nums.length, n = len;
        int i = 0, pos = 0, pre = nums[pos], temp = pre;
        if (k % n == 0) return;
        while (n -- != 0) {
            pos = (pos + k) % len;
            // swap
            temp = nums[pos];
            nums[pos] = pre;
            pre = temp;
            if (pos == i) {
                pos = ++i;
                pre = nums[pos];
                temp = pos;
            }
        }
    }
}

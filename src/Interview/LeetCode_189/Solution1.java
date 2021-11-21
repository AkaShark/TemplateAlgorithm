package Interview.LeetCode_189;

public class Solution1 {
    public void rotate(int[] nums, int k) {
        k %= nums.length; // k 取模于
        reverseNums(nums, 0, nums.length - 1);
        reverseNums(nums, 0, k - 1  );
        reverseNums(nums, k, nums.length - 1);

    }
    private void reverseNums(int[] nums, int start, int end) {
        while (end > start) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end --;
            start ++;
        }
    }
}

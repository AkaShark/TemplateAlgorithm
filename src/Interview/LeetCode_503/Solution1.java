package Interview.LeetCode_503;

public class Solution1 {
    static public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int item = nums[i];
            for (int j = i + 1; ; j++) {
                if (nums[j % nums.length] > item) {
                    ans[i] = nums[j % nums.length];
                    break;
                }
                System.out.println(j % nums.length);
                if (j % nums.length == i) {
                    ans[i] = -1;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        nextGreaterElements(new int[]{1,2,3,4,5});
    }
}

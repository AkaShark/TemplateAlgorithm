package EveryDay.LeetCode_240;

public class Solution2 {
    static public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length - 1;
        int ansC = 0;
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] > target || matrix[i][col] < target) {
                // 一定不符合 排除
                continue;
            } else {
                ansC = binarySearch(matrix[i], target);
            }
            if (matrix[i][ansC] == target) return true;
        }
        return false;
    }

    static private int binarySearch(int[] nums, int traget) {
        int left = 0, right = nums.length - 1;
        while (right > left) {
            int middle = (right - left) / 2 + left;
            if (nums[middle] >= traget) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        searchMatrix(new int[][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}}, 5);
    }
}

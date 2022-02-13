package labuladong_Algorithm.Array.LeetCode_48;

public class Solution {
    /**
     * 顺时针旋转90度
     * @param matrix matrix
     */
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        for (int i = 0; i < row; i++) {
            for (int j = i; j < row; j++) {
                // swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int[] rows : matrix) {
            reverse(rows);
        }
    }

    public void reverse(int[] nums) {
        int n = nums.length - 1;
        int i = 0, j = n;
        while (j > i) {
            // swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i ++;
            j --;
        }
    }

    /**
     * 逆时针旋转90度
     * @param matrix matrix
     */
    public void rotate_1(int[][] matrix) {
        int row = matrix.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                // swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[row - j - 1][row - i - 1];
                matrix[row - j - 1][row - i - 1] = temp;
            }
        }
        for (int[] num :
                matrix) {
            reverse(num);
        }
    }

}

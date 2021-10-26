package EveryDay.LeetCode_74;

public class Solution {
    // 抽象成BST方法
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int x = 0, y = col - 1;
        while (x < row && y > 0) {
            if (matrix[x][y] == target) {
                return true;
            }
            if (matrix[x][y] > target) {
                y --;
            } else {
                x ++;
            }
        }
        return false;
    }
}

package EveryDay.LeetCode_240;

public class Solution3 {
    // 将右上角的节点抽象成BST的根节点
    static public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int x = 0, y = col - 1;
        while (x < row && y >= 0) {
            if (matrix[x][y] == target) {
                return true;
            } else {
                if (matrix[x][y] > target) {
                    y --;
                } else {
                    x ++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        searchMatrix(new int[][]{
                {-5}}, -10);
    }

}

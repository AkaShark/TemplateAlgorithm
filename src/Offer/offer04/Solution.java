package Offer.offer04;

public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int row = 0, col = matrix[0].length - 1;
        int rows = matrix.length - 1, cols = matrix.length - 1;
        while (row <= rows && col >= 0) {
            if (matrix[row][col] > target) {
                col -- ;
            } else if (matrix[row][col] < target) {
                row ++;
            } else {
                return true;
            }
        }
        return false;
    }
}

package AlgorithmBased.LeetCode_74;

public class Solution {
    // 将二维矩阵抽象成一维数组，进行二分
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int elementNums = rows * cols;
        int left = 0, right = elementNums - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            int[] coordinate = conversionRow(mid, rows, cols);
            if (matrix[coordinate[0]][coordinate[1]] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        int res[] = conversionRow(left, rows, cols);
        if (matrix[res[0]][res[1]] == target) {
            return true;
        } else {
            return false;
        }
    }

    private int[] conversionRow(int num, int rows, int cols) {
        int row = num / cols;
        int col = num - (row * cols);
        return new int[]{row, col};
    }
}

package BinarySearch.LeetCode_74;

public class Solution2 {
    static public boolean searchMatrix(int[][] matrix, int target) {
        int row = binarySearchRow(matrix, target);
        int col = binarySearchCol(matrix, target, row);
        return matrix[row][col] == target? true: false;
    }

    static private int binarySearchRow(int[][] matrix, int target) {
        int col = 0;
        int left = 0, right = matrix.length - 1;
        while (right > left) {
            int mid = (right - left + 1) / 2 + left;
            if (matrix[mid][col] <= target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    static private int binarySearchCol(int[][] matrix, int target, int row) {
        int left = 0, right = matrix[0].length - 1;
        while (right > left) {
            int mid = (right - left + 1) / 2 + left;
            if (matrix[row][mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        searchMatrix(new int[][]{{1}, {3}}, 3);
    }
}

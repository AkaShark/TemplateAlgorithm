package BinarySearch.LeetCode_74;

public class Solution3 {
    static public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int left = 0, right = row * col - 1;
        while (right > left) {
            int mid = (right - left) / 2  + left;
            int x = matrix[mid / col][mid % col]; // 将mid隐射到原来的matrix二位数组中
            if (x >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return matrix[left / col][left % col] == target? true: false;
    }

    public static void main(String[] args) {
        searchMatrix(new int[][]{{1,3}}, 3);
    }
}

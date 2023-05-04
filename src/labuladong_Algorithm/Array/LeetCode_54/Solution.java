package labuladong_Algorithm.Array.LeetCode_54;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int upper_bound = 0, lower_bound = m;
        int left_bound = 0, right_bound = n;
        List<Integer> res = new LinkedList<>();
        while (res.size() < m * n) { // 还没有结束
            if (upper_bound < lower_bound) { // 在顶部从左向右遍历
                for (int i = left_bound; i < right_bound; i++) {
                    res.add(matrix[upper_bound][i]);
                }
                upper_bound ++;
            }
            // 在左侧从上往下
            if (left_bound < right_bound) {
                for (int i = upper_bound; i < lower_bound; i++) {
                    res.add(matrix[i][right_bound]);
                }
                right_bound --;
            }
            // 在底部从右往左
            if (upper_bound < lower_bound) {
                for (int i = right_bound; i > left_bound; i--) {
                    res.add(matrix[lower_bound][i]);
                }
                lower_bound --;
            }
            // 左侧从下到上
            if (left_bound < right_bound) {
                for (int i = lower_bound; i > upper_bound; i--) {
                    res.add(matrix[i][left_bound]);
                }
                left_bound ++;
            }
        }
        return res;
    }
}

package labuladong_Algorithm.Array.LeetCode_1094;

import labuladong_Algorithm.Array.Difference;

public class Solution {
   static public boolean carPooling(int[][] trips, int capacity) {
        Difference difference = new Difference(new int[1000]);
        int max = 0;
        for (int[] trip: trips) {
            // 乘客在车上的区间是 [trip[1], trip[2] - 1] 在第trip[2] 已经下车了
            if (trip[2] > max) max = trip[2]; // 记录最后下车的人
            difference.changeDiff(trip[1], trip[2] - 1, trip[0]);
        }
        int[] res = difference.result();

        for (int i = 0; i < res.length; i++) {
            if (res[i] > capacity) return false;
            if (i > max) return true;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{2,1,4},{3,2,7}};
        carPooling(matrix, 3);
    }
}

package labuladong_Algorithm.Array.LeetCode_1109;

import labuladong_Algorithm.Array.Difference;

public class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        Difference difference = new Difference(new int[n]);
        for (int[] bookSeat :
                bookings) {
            // 航班标号是从1开始的 所以差分数组在使用的时候需要进行 -1 操作
            difference.changeDiff(bookSeat[0] - 1, bookSeat[1] - 1, bookSeat[2]);
        }
        return difference.result();
    }
}

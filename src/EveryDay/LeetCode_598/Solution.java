package EveryDay.LeetCode_598;

public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minx = m, miny = n;
        for (int[] operation : ops) {
            minx = Math.min(minx, operation[0]);
            miny = Math.min(miny, operation[1]);
        }
        return minx * miny;
    }
}

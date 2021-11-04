package EveryDay.LeetCode_367;

public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 0) return false;
        if (num == 1) return true;
        long left = 0; long right = num / 2;
        while (right >= left) {
            long mid = left + (right - left) / 2;
            if (num == mid * mid) return true;
            else if (num > mid * mid) {
                left = mid + 1;
            } else if (num < mid * mid) {
                right = mid - 1;
            }
        }
        return false;
    }
}

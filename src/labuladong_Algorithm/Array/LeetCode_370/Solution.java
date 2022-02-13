package labuladong_Algorithm.Array.LeetCode_370;

import labuladong_Algorithm.Array.Difference;

public class Solution {
    int[] getModifiedArray(int length, int[][] updates) {
        Difference difference = new Difference(new int[length]);
        for (int[] action: updates) {
            difference.changeDiff(action[0], action[1], action[2]);
        }
        return difference.result();
    }
}

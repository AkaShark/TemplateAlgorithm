package AlgorithmBased.LeetCode_986;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < firstList.length && j < secondList.length) {
            int lo = Math.max(firstList[i][0], secondList[j][0]);
            int hi = Math.min(firstList[i][1], secondList[j][1]);
            if (hi >= lo) {
                ans.add(new int[]{lo, hi});
            }
            if (firstList[i][1] > secondList[j][1]) {
                j ++;
            } else {
                i ++;
            }
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}

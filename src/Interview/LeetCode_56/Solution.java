package Interview.LeetCode_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class
Solution {
    /*
     * 首先将列表中区间按照左端点升序排列，然后我们将第一个区间加入merged数组中，遍历之后的区间
     * 1. 如果当前区间的左端点在数组merged中最后一个区间的右端点之后，他们不会重合 直接将区间添加到merged数组之后
     * 2. 否则重合，需要更新merged数组中最后一个区间的右端点为两者中的较大值*/
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][2];
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0]; // 按照做左端点的大小排序
            }
        });
        for (int i = 0; i < intervals.length; i++) {
            int[] item = intervals[i];
            if (i == 0 || ans.get(ans.size() - 1)[1] < item[0]) {
                ans.add(item);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], item[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}

package Interview.LeetCode_128;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        // 将原数组转为Set 方便查找
        Set<Integer> num_set = new HashSet<>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;
        // 循环每个数
        for (int num: num_set) {
            // 裁剪 只有是连续序列的第一个数字才能进入
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                // 统计连续个数
                while (num_set.contains(currentNum + 1)) {
                    currentStreak ++;
                    currentNum++;
                }
                // 更新结果集
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}

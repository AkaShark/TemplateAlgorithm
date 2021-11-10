package EveryDay.LeetCode495;

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int finishTime = 0;
        int ans = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (timeSeries[i] >= finishTime) { // 攻击的时间大于上次结束中毒的时间
                ans += duration; // 直接添加duration的时间
            } else { // 还处在中毒状态
                ans += timeSeries[i] + duration - finishTime; // 计算中毒持续时间
            }
            finishTime = timeSeries[i] + duration; // 更新最后中毒的时间
        }
        return ans;
    }
}

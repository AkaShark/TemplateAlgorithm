package labuladong_Algorithm.Array.LeetCode_560;

import java.util.HashMap;

public class Solution {
    public int subarraySum_1(int[] nums, int k) {
        // 时间复杂度高 n2
        int[] preSum = new int[nums.length + 1];
        // 构造前缀和
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
        int ans = 0;
        // 枚举子数组
        for (int i = 0; i < preSum.length; i++) {
            for (int j = i + 1; j < preSum.length; j++) {
                // 根据前缀和获取子数组的和 判断是否为k
                if (preSum[j] - preSum[i] == k) ans++;
            }
        }
        return ans;
    }

    public int subarraySum(int[] nums, int k) {
        // 前缀和hash
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1); // 0
        int ans = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int other = sum - k;
            if (hashMap.containsKey(other)) {
                ans += hashMap.get(other); // other几次
            }
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}

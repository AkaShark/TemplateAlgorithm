package Interview.LeetCode_496;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    // 破坏了原数组的结构 这样的话找不到右边的比当前值大的元素了 所有不可以哦
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i + 1 == nums2.length? -1: nums2[i + 1]);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}

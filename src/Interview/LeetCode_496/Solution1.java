package Interview.LeetCode_496;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    static public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = nums2.length - 1; i >=0 ; i--) { // 倒叙nums2 构建单调栈
            int num = nums2[i];
            while (!queue.isEmpty() && num > queue.peek()) {
                queue.pop(); // 单调栈 小于的都出栈
            }
            map.put(num, queue.isEmpty()? -1: queue.peek());
            queue.push(num); // 放在后面如果num后面没有比他大的值的话queue的是empty的 offer 是添加到tail的位置
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}

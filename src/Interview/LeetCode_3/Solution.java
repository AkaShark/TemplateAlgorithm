package Interview.LeetCode_3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int ans = 0, right = -1;
        for (int left = 0; left < s.length(); left++) {
            if (left != 0) {
                // 移除左边界
                window.remove(s.charAt(left - 1));
            }
            // 扩张右边界
            while (right + 1 < s.length() && !window.contains(s.charAt(right + 1))) {
                right ++;
                window.add(s.charAt(right));
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}

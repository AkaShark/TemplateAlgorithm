package Interview.LeetCode_14;

public class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return null;
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    public String longestCommonPrefix(String[] strs, int start, int end) {
        if (start == end) { // 二分到头了 递归出口
            return strs[start];
        } else {
            int mid = (end - start) / 2 + start;
            String left = longestCommonPrefix(strs, start, mid);
            String right = longestCommonPrefix(strs, mid + 1, end);
            return commonPrefix(left, right);
        }
    }

    public String commonPrefix(String left, String right) {
        // 比较筛选出来的两个字符串
        int minLength = Math.min(left.length(), right.length());
        for (int i = 0; i < minLength; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i); // 返回前序
            }
        }
        return left.substring(0, minLength);
    }
}

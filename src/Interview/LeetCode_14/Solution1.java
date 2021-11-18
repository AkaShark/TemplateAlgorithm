package Interview.LeetCode_14;

public class Solution1 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return null;
        int col = strs[0].length();
        int row = strs.length;
        for (int i = 0; i < col; i++) {
            char c = strs[0].charAt(i); // 获取列所在的字符
            for (int j = 0; j < row; j++) {
                if (strs[j].charAt(i) != c || i == strs[j].length()) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return null;
    }
}

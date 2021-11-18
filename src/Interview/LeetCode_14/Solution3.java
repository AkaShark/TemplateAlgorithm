package Interview.LeetCode_14;

public class Solution3 {
    // 不对确实需要全变量
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return null;
        if (strs.length == 1) return strs[0];
        String string1 = strs[0], string2 = strs[1];
        int length = Math.min(string1.length(), string2.length());
        for (int i = 0; i < length; i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                return string1.substring(0, i);
            }
        }

        return string1;
    }
}

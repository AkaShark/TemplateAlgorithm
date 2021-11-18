package Interview.LeetCode_14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;
        for (int i = 0; i < count; i++) {
            prefix = longestCommPrefix(prefix, strs[i]); // 逐渐减少
            if (prefix.length() == 0) break;;

        }
        return prefix;
    }

    public String longestCommPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index ++;
        }
        return str1.substring(0, index);
    }
}

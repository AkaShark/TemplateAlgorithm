package Interview.LeetCode_14;

public class Solution4 {
    // 二分没太看懂
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return null;
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }
        int low = 0, high = minLength;
        while (low < high) { // 二分法
            int mid = (high - low) / 2 + low;
            if (isCommonPrefix(strs, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return strs[0].substring(0, low);
    }

    public boolean isCommonPrefix(String[] strs, int length) {
        String str0 = strs[0].substring(0, length); // 折半
        int count = strs.length;
        for (int i = 0; i < count; i++) {
            String str = strs[i];
            for (int j = 0; j < length; j++) {
                if (str0.charAt(j) != str.charAt(j))
                    return false;
            }
        }
        return true;
    }
}

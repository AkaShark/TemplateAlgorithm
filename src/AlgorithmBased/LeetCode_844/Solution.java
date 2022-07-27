package AlgorithmBased.LeetCode_844;

public class Solution {
    static public boolean backspaceCompare(String s, String t) {
        String s_backspace = backspaceString(s);
        String t_backspace = backspaceString(t);
        return s_backspace.equals(t_backspace);
    }

    static private String backspaceString(String s) {
        if (s == null || s.length() == 0) return s;
        int cur = 0;
        while (cur < s.length()) {
            if (s.charAt(cur) == '#') {
                if (cur == 0) {
                    s = s.substring(0, 0) + s.substring(1);
                } else {
                    s = s.substring(0, cur - 1) + s.substring(cur + 1);
                }
                if (cur > 0) cur --;
            } else {
                cur ++;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        backspaceCompare("a##c", "#a#c");
    }
}

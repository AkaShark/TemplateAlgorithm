package AlgorithmBased.LeetCode_844;

public class Solution1 {
    // 栈
    public boolean backspaceCompare(String s, String t) {
        String s_backspace = backspaceString(s);
        String t_backspace = backspaceString(t);
        System.out.println(s_backspace);
        System.out.println(t_backspace);
        return s_backspace.equals(t_backspace);
    }

    private String backspaceString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (stringBuilder.length() > 0) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}

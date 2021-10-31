package EveryDay.LeetCode_500;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    static String[] ss = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
    static int[] hash = new int[26];
    static { // 给26个字母加上行号
        for (int i = 0; i < ss.length; i++) {
            for (char c: ss[i].toCharArray()) {
                hash[c - 'a'] = i;
            }
        }
    }

    static public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        out:for (String w: words) {
            int t = -1;
            for (char c : w.toCharArray()) {
                c = Character.toLowerCase(c);
                if (t == -1) t = hash[c - 'a'];
                else if (t != hash[c - 'a']) continue out; // 跳出双重循环
            }
            list.add(w);
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        findWords(new String[]{"Hello","Alaska","Dad","Peace"});
    }
}

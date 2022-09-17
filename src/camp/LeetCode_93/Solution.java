package camp.LeetCode_93;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) return res;
        Deque<String> path = new ArrayDeque<>();
        dfs(s, 0, 0, path, res);
        return res;
    }

    public void dfs(String s, int split, int begin, Deque<String> path, List<String> res) {
        if (begin == s.length()) {
            if (split == 4) {
                res.add(String.join(".", path));
            }
            return;
        }
        // 看上下的太多或者不够 直接裁减掉
        if (s.length() - begin < (4 - split) || s.length() - begin > 3 * (4 - split)) {
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (begin + i >= s.length()) {
                break;
            }
            int ip = ipTransform(s, begin, begin + i);
            if (ip != -1) {
                // ip是ok的做回溯
                path.addLast(ip + "");
                dfs(s, split + 1, begin + i + 1, path, res);
                path.removeLast();
            }
        }
    }

    public int ipTransform(String s, int begin, int end) {
        int len = end - begin + 1;
        if (len > 1 && s.charAt(begin) == '0') return -1;

        int res = 0;
        for (int i = begin; i <= end ; i++) {
            res = res * 10 + s.charAt(i) - '0';
        }
        if (res > 255) return -1;
        return res;
    }



}

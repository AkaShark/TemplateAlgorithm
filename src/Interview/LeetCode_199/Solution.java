package Interview.LeetCode_199;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, 0, ans);
        return ans;
    }
    public void dfs(TreeNode root, int depth, List<Integer> ans) {
        if (root == null) return;
        if (depth == ans.size()) {
            ans.add(root.val);
        }
        depth ++;
        dfs(root.right, depth, ans);
        dfs(root.left, depth, ans);
    }
}

package Tree.LeetCode199;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, 0, ans);
        return ans;
    }

    private void dfs(TreeNode root, int depth, List<Integer> ans) {
        if (root == null) return;
        if (depth == ans.size()) { // 第一个节点
            ans.add(root.val);
        }
        depth ++;
        dfs(root.right, depth, ans);
        dfs(root.left, depth, ans);
    }
}

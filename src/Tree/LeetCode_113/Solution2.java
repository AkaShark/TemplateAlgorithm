package Tree.LeetCode_113;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    // 回溯思想
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return ans;
    }

    private void dfs(TreeNode node, int targetSum) {
        if (node == null) return;
        path.add(node.val);
        targetSum -= node.val;
        if (node.left == null && node.right == null && targetSum == 0) {
            ans.add(new ArrayList<>(path));
        }
        dfs(node.left, targetSum);
        dfs(node.right, targetSum);
        path.remove(path.size() - 1);
    }

}

package Tree.LeetCode_114;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution1 {
    // 存储路径 BFS
    public void flatten(TreeNode root) {
        List<TreeNode> path = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                path.add(root); // 前序遍历
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        for (int i = 1; i < path.size(); i++) {
            TreeNode pre = path.get(i - 1), cur = path.get(i);
            pre.left = null;
            pre.right = cur;
        }
    }
}

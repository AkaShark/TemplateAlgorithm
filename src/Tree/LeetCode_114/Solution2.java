package Tree.LeetCode_114;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution2 {
    // 不存储 直接转化 存储右节点信息 记录prev
    public void flatten(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        if (root == null) return;
        stack.push(root);
        TreeNode prev = null; // 标记前一个节点
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (prev != null) {
                prev.left = null;
                prev.right = cur;
            }
            // 注意顺序
            if (cur.right != null) stack.push(cur.right);
            if (cur.left != null) stack.push(cur.left);
            prev = cur; // 更新标记节点
        }
    }
}

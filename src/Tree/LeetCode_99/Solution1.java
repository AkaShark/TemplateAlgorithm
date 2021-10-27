package Tree.LeetCode_99;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1 {
    public void recoverTree(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode preNode = new TreeNode(Integer.MIN_VALUE);
        TreeNode xNode = null, yNode = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= preNode.val) {
                yNode = root; // 标识第一个
                if (xNode == null) {
                    xNode = preNode; // 标识第一个
                }
            }
            preNode = root;
            root = root.right;
        }
        swap(xNode, yNode);

    }

    private void swap(TreeNode node1, TreeNode node2) {
        if (node1 != null && node2 != null) {
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }
    }
}

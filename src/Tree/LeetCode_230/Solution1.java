package Tree.LeetCode_230;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1 {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return -1;
        int n = k - 1;
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                n --;
                root = root.left;
            }
            root = stack.pop();
            if (n == 0) {
                return root.val;
            }
            root = root.right;
        }
        return -1;
    }

}

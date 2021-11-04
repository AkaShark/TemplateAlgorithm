package Tree.LeetCode_114;

import Util.TreeNode;

public class Solution3 {
    // 寻找前驱节点
    public void flatten(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                TreeNode next = cur.left;
                TreeNode pre = next;
                // 找左子树中最右边的节点
                while (pre.right != null) {
                    pre = pre.right;
                }
                pre.right = cur.right;
                cur.left = null;
                cur.right = next; // 右边的节点为左节点
            }
            cur = cur.right;
        }
    }
}

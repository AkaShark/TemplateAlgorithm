package Tree.LeetCode_99;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<TreeNode> list = new ArrayList<>();
    public void recoverTree(TreeNode root) {
        inorderTree(root);
        int x = Integer.MIN_VALUE, y = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).val <= list.get(i - 1).val) {
                if (x == Integer.MIN_VALUE) {
                    x = i - 1;
                } else {
                    y = i;
                }
            }
        }
        if (y == Integer.MIN_VALUE) {
            swap(list.get(x), list.get(x + 1));
        } else {
            swap(list.get(x), list.get(y));
        }

    }

    private void inorderTree(TreeNode root) {
        if (root == null) return;
        inorderTree(root.left);
        list.add(root);
        inorderTree(root.right);
    }

    private void swap(TreeNode node1, TreeNode node2) {
        if (node1 != null && node2 != null) {
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }
    }

}

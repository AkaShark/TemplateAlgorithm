package Tree.LeetCode_1382;

import Util.ListNode;
import Util.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new LinkedList<>();
        inorder(root, inorder);

        return build(inorder, 0, inorder.size() - 1);
    }

    private void inorder(TreeNode root, List<Integer> inorderPath) {
        inorder(root.left, inorderPath);
        inorderPath.add(root.val);
        inorder(root.right, inorderPath);
    }

    private TreeNode build(List<Integer> inorder, int left, int right) {
        if (left > right) return null;
        int mid = (right - left) / 2 + left;
        TreeNode node = new TreeNode(inorder.get(mid));
        node.left = build(inorder, left, mid - 1);
        node.right = build(inorder, mid + 1, right);
        return node;
    }


}

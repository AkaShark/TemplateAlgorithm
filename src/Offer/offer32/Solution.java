package Offer.offer32;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Solution {
    public int[] levelOrder(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if (root == null) return new int[]{};
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);
            ans.add(node.val);
        }
        int[] ansArray = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ansArray[i] = ans.get(i);
        }
        return ansArray;
    }
}

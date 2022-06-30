package ReviewOffer.offer_32;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[]{};
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<Integer> ans = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            TreeNode node = deque.poll();
            ans.add(node.val);
            if (node.left != null) {
                deque.offer(node.left);
            }
            if (node.right != null) {
                deque.offer(node.right);
            }
        }
        int[] ansArray = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ansArray[i] = ans.get(i);
        }
        return ansArray;
    }
}

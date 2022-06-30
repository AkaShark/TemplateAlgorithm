package ReviewOffer.offer_32_3;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        boolean isOrder = false;
        while (!deque.isEmpty()) {
            int size = deque.size();
            Deque<Integer> temp = new ArrayDeque<>();
            while (size > 0) {
                TreeNode node = deque.poll();
                if (!isOrder) {
                    temp.addLast(node.val);
                } else {
                    temp.addFirst(node.val);
                }
                if (node.left != null) {
                    deque.offer(node.left);
                }
                if (node.right != null) {
                    deque.offer(node.right);
                }
                size --;
            }
            isOrder = !isOrder;
            ans.add(new ArrayList<>(temp));
        }
        return ans;
    }
}

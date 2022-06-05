package Offer.offer32_3;

import Util.TreeNode;

import java.util.*;

public class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        boolean reverse = false;
        while (!deque.isEmpty()) {
            int size = deque.size();
            Deque<Integer> arrayList = new LinkedList<>();
            while (size > 0) {
                TreeNode node = deque.poll();
                if (!reverse) {
                    arrayList.addFirst(node.val);
                } else {
                    arrayList.addLast(node.val);
                }
                if (node.left != null)
                    deque.offer(node.left);
                if (node.right != null)
                    deque.offer(node.right);
                size --;
            }
            ans.add(new LinkedList<>(arrayList));
            reverse = !reverse;
        }
        return ans;
    }
}

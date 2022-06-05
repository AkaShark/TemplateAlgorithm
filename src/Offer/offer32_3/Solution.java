package Offer.offer32_3;

import Util.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        boolean reverse = false;
        while (!deque.isEmpty()) {
            int size = deque.size();
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (size > 0) {
                TreeNode node = deque.poll();
                arrayList.add(node.val);
                if (node.left != null)
                    deque.offer(node.left);
                if (node.right != null)
                    deque.offer(node.right);
                size --;
            }
            if (reverse) {
                Collections.reverse(arrayList);
                ans.add(arrayList);
            } else {
                ans.add(arrayList);
            }
            reverse = !reverse;
        }
        return ans;
    }
}

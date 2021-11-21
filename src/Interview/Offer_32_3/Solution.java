package Interview.Offer_32_3;

import Util.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if (root == null) return ans;
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> item = new ArrayList<>();
            while (size > 0) {
                size --;
                TreeNode node = queue.poll();
                item.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            if (flag) {
                ans.add(item);
            } else {
                Collections.reverse(item);
                ans.add(item);
            }
        }
        return ans;
    }
}

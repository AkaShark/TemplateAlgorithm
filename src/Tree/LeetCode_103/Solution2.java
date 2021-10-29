package Tree.LeetCode_103;

import Util.TreeNode;

import java.util.*;

public class Solution2 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        boolean flag = true;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            Deque<Integer> item = new LinkedList<>();
            while (size > 0) {
                if (flag) {
                    TreeNode node = queue.pollLast();
                    item.add(node.val);
                    if (node.left != null) queue.addFirst(node.left);
                    if (node.right != null) queue.addFirst(node.right);
                } else {
                    TreeNode node = queue.pollFirst();
                    item.add(node.val);
                    if (node.right != null) queue.addLast(node.right);
                    if (node.left != null) queue.addLast(node.left);
                }
                size --;
            }
            flag = !flag;
            ans.add(new LinkedList<>(item));
        }
        return ans;
    }
}

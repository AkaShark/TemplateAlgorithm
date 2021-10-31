package Tree.LeetCode_107;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Deque<List<Integer>> ans = new ArrayDeque<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> item = new ArrayList<>();
            while (size > 0) {
                TreeNode node = queue.poll();
                item.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                size --;
            }
            ans.addFirst(item);
        }
        return new ArrayList<>(ans);
    }
}

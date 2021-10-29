package Tree.LeetCode_103;

import Util.TreeNode;
import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class Solution1 {
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
                TreeNode node = queue.poll();
                if (flag) {
                    item.addLast(node.val);
                } else {
                    item.addFirst(node.val);
                }
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                size --;
            }
            flag = !flag;
            ans.add(new LinkedList<>(item));
        }
        return ans;
    }
}

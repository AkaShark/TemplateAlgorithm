package Tree.LeetCode_103;

import Util.TreeNode;

import java.util.*;

public class Solution {
    // 出错咯 这个地方在下层变量的时候还是从右往左的 应该使用双端队列 从头尾来插入
    static public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        boolean flag = true;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> item = new ArrayList<>();
            while (size > 0) {
                TreeNode node = queue.poll();
                item.add(node.val);
                if (flag) {
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                } else {
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                size --;
            }
            flag = !flag;
            ans.add(item);
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node3;
        node1.left = node2;
        node3.right = node4;

        zigzagLevelOrder(root);
    }

}

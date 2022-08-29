package task5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        //
        System.out.println(root.val);
        dfs(root.right);
    }

    public void inOrder(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root != null) {
            stack.offer(root.left);
            root = root.left;
        }
        while (!stack.isEmpty()) {
            TreeNode node = stack.poll();
            //
            System.out.println(node.val);

            if (node.right != null) {
                while (node != null) {
                    stack.offer(root.left);
                    node = node.left;
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}


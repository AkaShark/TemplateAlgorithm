package Offer.offer34;

import Util.TreeNode;

import java.util.*;

public class Solution1 {
    HashMap<TreeNode, TreeNode> hashMap = new HashMap<>();
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) return res;
        Deque<Integer> sumQueue = new ArrayDeque<>();
        Deque<TreeNode> nodeQueue = new ArrayDeque<>();
        sumQueue.offer(0);
        nodeQueue.offer(root);
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            int sum = sumQueue.poll() + node.val;
            if (node.left == null && node.right == null) {
                if (sum == target) {
                    // add res
                    getParentNode(node);
                }
            } else {
                if (node.left != null) {
                    hashMap.put(node.left, node);
                    nodeQueue.offer(node.left);
                    sumQueue.offer(sum);
                }

                if (node.right != null) {
                    hashMap.put(node.right, node);
                    nodeQueue.offer(node.right);
                    sumQueue.offer(sum);
                }
            }
        }
        return res;
    }

    public void getParentNode(TreeNode node) {
        List<Integer> temp = new LinkedList<>();
        while (node != null) {
            temp.add(node.val);
            node = hashMap.get(node);
        }
        Collections.reverse(temp);
        res.add(new LinkedList<Integer>(temp));
    }
}

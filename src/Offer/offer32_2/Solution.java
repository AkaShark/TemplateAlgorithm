package Offer.offer32_2;

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
            ans.add(arrayList);
        }
        return ans;
    }
}

package Tree.LeetCode_94;

import Util.TreeNode;

import java.util.*;

public class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        List<Integer> ans = new ArrayList<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            // 中序遍历
            root = stack.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }
    
}

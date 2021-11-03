package Tree.LeetCode_112;

import Util.TreeNode;

public class Solution1 {
    // 深度优先搜索
     public boolean hasPathSum(TreeNode root, int targetSum) {
         if (root == null) return false;
         return find(root, targetSum, 0) >= 1;
     }

     private int find(TreeNode root, int target, int flag) {
         if (root == null) return flag;
         if (root.val == target && root.left == null && root.right == null) flag ++;
         if (root.left != null) find(root.left, target - root.val, flag);
         if (root.right != null) find(root.right, target - root.val, flag);
         return flag;
     }

}

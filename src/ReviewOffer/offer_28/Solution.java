package ReviewOffer.offer_28;

import Util.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return checkSymmetric(root, root);
    }
    public boolean checkSymmetric(TreeNode A, TreeNode B) {
        if (A == null && B == null) return true;
        if (A == null || B == null) return false;
        if (A.val != B.val) return false;
        return checkSymmetric(A.left, B.right) && checkSymmetric(A.right, B.left);
    }
}


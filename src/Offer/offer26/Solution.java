package Offer.offer26;

import Util.TreeNode;

public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return check(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }
    public boolean check(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null) return false;
        if (A.val != B.val) return false;
        return check(A.left, B.left) && check(A.right, B.right);
    }
}

package ReviewOffer.offer_26;

import Util.TreeNode;

public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return checkiSSubStructure(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean checkiSSubStructure(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null) return false;
        if (A.val != B.val) return false;
        return checkiSSubStructure(A.left, B.left) && checkiSSubStructure(A.right, B.right);
    }
}

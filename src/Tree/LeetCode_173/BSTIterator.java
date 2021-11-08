package Tree.LeetCode_173;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BSTIterator {
//    Deque<TreeNode> stack = new ArrayDeque<>();
//    TreeNode root = null;
//    public BSTIterator(TreeNode root) {
//        this.root = root;
//    }
//
//    public int next() {
//        // 前序遍历
//        while(root != null || !stack.isEmpty()){
//            while (root != null) {
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.pop();
//            int res = root.val;
//            root = root.right;
//            return res;
//        }
//        return -1;
//    }
//
//    public boolean hasNext() {
//        if (root == null && stack.isEmpty()) return false;
//        return true;
//    }

    private int idx;
    private List<Integer> arr;

    public BSTIterator(TreeNode root) {
        idx = 0;
        arr = new ArrayList<Integer>();
        inorderTraversal(root, arr);
    }

    public int next() {
        return arr.get(idx++);
    }

    public boolean hasNext() {
        return idx < arr.size();
    }

    private void inorderTraversal(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, arr);
        arr.add(root.val);
        inorderTraversal(root.right, arr);
    }
}

package camp.Solution2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static class TreeeNode {
        int val = 0;
        TreeeNode left;
        TreeeNode right;

        public TreeeNode(int val) {
            this.val = val;
        }

        public TreeeNode() {
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] trees = new int[n];
        int i = 0;
        while (sc.hasNext()) {
            trees[i] = sc.nextInt();
            i++;
        }
        TreeeNode root = buildTree(trees);
    }

    static int i = 0;
    static public TreeeNode buildTree(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        TreeeNode node = new TreeeNode();
        if (i < arr.length) {
            node.val = arr[i ++];
            if (node.val == -1) {
                return null;
            } else {
                node.left = buildTree(arr);
                node.right = buildTree(arr);
            }
        }
        return node;
    }
    static int ans = 0;
    static public int findLeaf(TreeeNode root) {
        if (root == null) return -1;
        System.out.println(root.val);
        if (root.left == null && root.right == null) {
            ans++;
        }
        findLeaf(root.left);
        findLeaf(root.right);
        return ans;
    }
}
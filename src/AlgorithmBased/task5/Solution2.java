package AlgorithmBased.task5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
    static class TreeNode {
        int val;
        TreeNode left;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String args[])
    {
        HashMap<Integer, TreeNode> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        TreeNode root = new TreeNode(1);
        hashMap.put(1, root);
        while (len > 0) {
            int father = scanner.nextInt();
            TreeNode fatherNode = hashMap.get(father);
        }
        System.out.println(2);
    }
}

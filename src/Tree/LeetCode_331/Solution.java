package Tree.LeetCode_331;

import java.util.ArrayList;

public class Solution {
    // 满二叉树的叶子节点数总是比非叶子节点数大1
    static public boolean isValidSerialization(String preorder) {
        int degree = 1;
        String[] stringArray = preorder.split(",");
        for (String string : stringArray) {
            if (degree == 0) {
                return false;
            }
            if (string.equals("#")) {
                degree -= 1;
            } else {
                degree += 1;
            }
        }
        // 判断最后形成的二叉树度是否相等 因为根节点入度为0出度为2 将根节点抽象为一般的节点 则 设置degree为1
        return degree == 0;
    }

}

package Tree.LeetCode_331;

public class Solution1 {
    public boolean isValidSerialization(String preorder) {
        int n = preorder.length();
        int i = 0;
        int slots = 1;
        while (i < n) {
            if (slots == 0) { // 遍历没结束 没了 肯定是不符合的
                return false;
            }
            if (preorder.charAt(i) == ',') {
                i ++;
            } else if (preorder.charAt(i) == '#') {
                slots --;
                i ++;
            } else {
                while (i < n && preorder.charAt(i) != ',') {
                    i ++;
                }
                slots ++; // slots = slots - 1 + 2;
            }
        }
        return slots == 0;
    }
}

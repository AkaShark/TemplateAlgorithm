package AlgorithmBased.task2;

import java.util.*;

public class Solution {
   static public int solution(String S) {
        // write your code in Java 11 (Java SE 11)
        char[] balls = S.toCharArray();
        List<Integer> indexArray = new LinkedList<>();
        for (int i = 0; i < balls.length; i++) {
            if (balls[i] == 'R') {
                indexArray.add(i);
            }
        }
        if (indexArray.size() == 0) return 0;
        if (indexArray.size() > 50000) return -1;
        int mid = indexArray.size() / 2;
        int ans = 0;
        int tem = mid - 1;
        while (tem >= 0) {
            ans += indexArray.get(mid) - indexArray.get(tem) - 1;
            tem --;
        }
        tem = mid + 1;
        while (tem < indexArray.size()) {
            ans += indexArray.get(tem) - indexArray.get(mid) - 1;
            tem ++;
        }
        return ans;
    }

    public static void main(String[] args) {
        solution("WRRWRW");
    }
}

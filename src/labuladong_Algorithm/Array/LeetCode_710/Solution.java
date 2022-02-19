package labuladong_Algorithm.Array.LeetCode_710;

import java.util.HashMap;
import java.util.Random;

/**
 * 如果想要高效地，等概率地随机获取元素，就要使用数组作为底层容器
 * 如果要保持数组元素的紧凑性，可以把待删除元素换到最后，然后pop掉最后一个元素，这样的时间复杂度就是O(10
 * 当然需要额外的hash记录元素的index关系
 * 数组中有空洞(黑名单数字) 可以利用hash表做映射关系，让数组在逻辑上是紧凑的 方便随机取元素
 *
 * 数组分为两个部分前半部分的黑名单的数字映射到后面
 */
public class Solution {
    private int size;
    private HashMap<Integer, Integer> hashMap = new HashMap<>();
    public Solution(int n, int[] blacklist) {
        size = n - blacklist.length; // 真实可选数组的大小
        for (int num: blacklist) { // 初始化hashMap
            hashMap.put(num, 0);
        }
        // 填补blacklist空缺 将blacklist放在最后的位置
        int last = n - 1;
        for (int num: blacklist) {
            if (num >= size) continue; // 真是检索的范围是0 size的随机数字 剩余的部分是黑名单
            while (hashMap.containsKey(last)) {
                last --;
            }
            hashMap.put(num, last);
            last --;
        }
    }

    public int pick() {
        Random random = new Random();
        int index = random.nextInt(size);
        if (hashMap.containsKey(index)) {
            return hashMap.get(index);
        }
        return index;
    }
}

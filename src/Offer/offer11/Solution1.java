package Offer.offer11;

public class Solution1 {
    // 找最小的元素其实就是找右数组开始的问题 旋转点
    public int minArray(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] > numbers[i]) {
                return numbers[i];
            }
        }
        return numbers[0];
    }
}

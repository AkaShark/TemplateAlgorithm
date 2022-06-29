package ReviewOffer.offer11;

public class Solution {
    public int minArray(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        while (right > left) {
            int mid = (right - left) / 2 + left;
            if (numbers[mid] > numbers[right]) { // 左数组
                left = mid + 1;
            } else if (numbers[mid] < numbers[right]) { // 右数组
                right = mid;
            } else {
                right --;
            }
        }
        return numbers[left];
    }
}

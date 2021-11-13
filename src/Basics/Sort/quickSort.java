package Basics.Sort;

public class quickSort {
    static public int[] quickSort(int[] array) {
        sort(array, 0, array.length - 1);
        return array;
    }

    static private void sort(int[] array, int left, int right) {
       if (left < right) {
           int position = findPosition(array, left, right);
           sort(array, left, position - 1);
           sort(array, position + 1, right);
       }
    }

    static private int findPosition(int[] array, int left, int right) {
        int target = array[left]; // 取第一个值作为基准值
        while (right > left) {
            while (right > left && array[right] >= target) {
                right--;
            }
            swap(array, left, right);
            while (right > left && array[left] <= target) {
                left++;
            }
            swap(array, left, right);
        }
        return left;
    }

    static private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 5, 4, 3, 6, 8, 7};
        int[] ans = quickSort(array);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

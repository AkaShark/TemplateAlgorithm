package Interview.NC_140;

public class Solution {
    static public int[] MySort (int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    static private void quickSort(int[] list, int left, int right) {
        if (left < right) {
            // 寻找分割点
            int point = partition(list, left, right);
            // 递归调用对左数组
            quickSort(list, left, point - 1);
            // 递归调用对右数组
            quickSort(list, point + 1, right);
        }
    }

    static private int partition(int[] list, int left, int right) {
        // 使用第一个数作为基准
        int first = list[left];
        while (right > left) {
            // 从右边往左边找
            while (left < right && list[right] >= first) {
                right--;
            }
            // 找到不符合条件的 交换元素位置
            swap(list, left, right);

            while (left < right && list[left] <= first) {
                left ++;
            }
            swap(list, left, right);
        }

        // 返回分割点的位置
        return left;
    }

   static private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 5, 4, 3, 6, 8, 7};
        int[] ans = MySort(array);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

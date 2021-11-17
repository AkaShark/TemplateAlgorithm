package Basics.HeadSort;

public class Solution {
    /*
    * 一次建堆
    * arrays 看做完全二叉树
    * currentRootNode 看做父节点位置
    * size 节点总数*/
    static public void headify(int[] arrays, int currentRootNode, int size) {
        if (currentRootNode < size) {
            // 左子树活右子树的位置
            int left = 2 * currentRootNode + 1;
            int right = 2 * currentRootNode + 2;

            // 把当前父节点位置看成最大的
            int max = currentRootNode;
            if (left < size) {
                // 如果比当前根元素要大，记录他的位置
                if (arrays[max] < arrays[left]) {
                    max = left;
                }
            }

            if (right < size) {
                // 如果比当前max要大记录他
                if (arrays[max] < arrays[right]) {
                    max = right;
                }
            }

            // 如果最大的不是根元素位置，那么交换
            if (max != currentRootNode) {
                int temp = arrays[max];
                arrays[max] = arrays[currentRootNode];
                arrays[currentRootNode] = temp;

                // 继续比较 max是交换完的位置了
                headify(arrays, max, size);
            }
        }
    }

    // 完成一次建堆
    static public void maxHeapify(int[] array, int size) {
        // i从size开始倒过来的
        for (int i = size - 1; i >= 0 ; i--) {
            headify(array, i, size);
        }
    }

    static public void heapSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // 每次建堆都可以排除一个元素了
            maxHeapify(array, array.length - i);

            // 交换 对顶元素和第一个元素交换
            int temp = array[0];
            array[0] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }
    }

    /*堆排序的时间复杂度是O(nlogn) 空间复杂度是O(1)*/
    public static void main(String[] args) {
        int[] array = new int[]{1,3,4,2,5,7,6,8,9};
        heapSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

package labuladong_Algorithm.Array.LeetCode_380;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * 由于随机获取每个元素的概率是相同的，这样的话如果底层使用hash来处理的话达不到O(1)的要求
 * 同时要求删除和插入的时间复杂度是O(1) 这样的话要求底层的数据结构是一个数组，但是数组怎么做到删除和变成O(1)
 * 变成了难点，我们可以将修改的元素和数组的最后一个元素做交换然后再进行插入和删除的操作这样的话就可以实现数组的操作变成O(1)
 * 这样的话我们需要提前记录数据中的每个元素的index，并在操作前提前将要操作数和数组最后一个元素进行交换
 * 依次达到时间复杂度为O(1)的操作 有点类似于页和页表的关系
 */
class RandomizedSet {
    private ArrayList<Integer> nums;
    private HashMap<Integer, Integer> hashMap = new HashMap<>();
    public RandomizedSet() {
        nums = new ArrayList<>();
        hashMap = new HashMap<>();
    }

    public boolean insert(int val) {
        if (hashMap.containsKey(val)) { // 已经存在
            return false;
        }
        // 添加到最后一个元素
        nums.add(val);
        hashMap.put(val, nums.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!hashMap.containsKey(val)) {
            return false;
        }
        // 获取当前元素的index
        int index = hashMap.get(val);
        // 最后一个元素的index
        int backIndex = hashMap.get(nums.get(nums.size() - 1));
        hashMap.put(nums.get(nums.size() - 1), index); // 更新hash
        swap(index, backIndex); // 将当前元素放到最后一个元素
        nums.remove(nums.size() - 1); // 移除最后一个元素
        hashMap.remove(val); // hash表更新
        return true;
    }

    public int getRandom() {
        Random random = new Random();
        return nums.get(random.nextInt(nums.size()));
    }

    private void swap(int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(0);
        randomizedSet.insert(1);
        randomizedSet.remove(0);
        randomizedSet.insert(2);
        randomizedSet.remove(1);
        randomizedSet.getRandom();
    }
}

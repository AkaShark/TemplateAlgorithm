package AlgorithmBased.task4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        List<Integer> nums = new LinkedList<>();
        while (scanner.hasNext()) {
            nums.add(scanner.nextInt());
        }
        for (int i = 0; i < len; i++) {
            System.out.println(nums.get(i));
        }
    }
}

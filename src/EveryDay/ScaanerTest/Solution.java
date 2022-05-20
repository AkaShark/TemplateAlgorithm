package EveryDay.ScaanerTest;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        /*
        * 读取输入的多个字符
        * */
        // 1. 一直循环通过index 记录来结束循环
//        Scanner s = new Scanner(System.in);
//        System.out.println("请输入整数：");
//        int index = 0;
//        while (true) {
//            int sum = s.nextInt();
//            System.out.println("输入的整数" + sum);
//            index ++;
//            if (index == 10) {
//                break;
//            }
//        }
////
        // 2. 一直循环输入等待 输入不是整数的实施停止循环
        Scanner in =  new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = 0;
        while(in.hasNextInt()) {
            num = in.nextInt();
        }
        reverse(num);

    }

    public static void reverse(int n) {
        Queue<Integer> queue = new ArrayDeque<>();
        while (n > 0) {
            queue.offer(n % 10);
            n = n / 10;
        }
        System.out.println("数字的长度" + queue.size());
        int size = queue.size();
        int sum = 0;
        for (int i = size - 1; i >= 0; i--) {
            int num = queue.poll();
            sum = (int) (sum + num * Math.pow(10, i));
        }
        System.out.println(sum);
    }
}

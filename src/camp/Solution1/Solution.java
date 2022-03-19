package camp.Solution1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(solution(n));
    }

    static public int solution(String str) {
        String sb = str.substring(3);
        Integer in = Integer.valueOf(sb, 16);
        int ans = Integer.bitCount(in);
        return ans;
    }

}

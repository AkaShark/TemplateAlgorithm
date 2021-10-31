package EveryDay.LeetCode_500;

import java.util.*;

public class Solution {
    static private HashSet<Character> line1 = new HashSet<>();
    static private HashSet<Character> line2 = new HashSet<>();
    static private HashSet<Character> line3 = new HashSet<>();
    static public String[] findWords(String[] words) {
        initLineSet();
        List<String> ans = new ArrayList<>();
        for (String item : words) {
            boolean flag = true;
            if (line1.contains(Character.toUpperCase(item.charAt(0)))) {
                for (int i = 1; i < item.length(); i++) {
                    Character tem = Character.toUpperCase(item.charAt(i));
                    if (!line1.contains(tem)) {
                        flag = false;
                        break;
                    }
                }
            } else if (line2.contains(Character.toUpperCase(item.charAt(0)))) {
                for (int i = 1; i < item.length(); i++) {
                    Character tem = Character.toUpperCase(item.charAt(i));
                    if (!line2.contains(tem)) {
                        flag = false;
                        break;
                    }
                }
            } else if (line3.contains(Character.toUpperCase(item.charAt(0)))) {
                for (int i = 1; i < item.length(); i++) {
                    Character tem = Character.toUpperCase(item.charAt(i));
                    if (!line3.contains(tem)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag)
                ans.add(item);

        }

        String[] ansArray = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ansArray[i] = ans.get(i);
        }
        return ansArray;
    }
    static private void initLineSet() {
        line1.add('Q');
        line1.add('W');
        line1.add('E');
        line1.add('R');
        line1.add('T');
        line1.add('Y');
        line1.add('U');
        line1.add('I');
        line1.add('O');
        line1.add('P');
        line2.add('A');
        line2.add('S');
        line2.add('D');
        line2.add('F');
        line2.add('G');
        line2.add('H');
        line2.add('J');
        line2.add('K');
        line2.add('L');
        line3.add('Z');
        line3.add('X');
        line3.add('C');
        line3.add('V');
        line3.add('B');
        line3.add('N');
        line3.add('M');

    }

    public static void main(String[] args) {
        findWords(new String[]{"Hello","Alaska","Dad","Peace"});
    }
}

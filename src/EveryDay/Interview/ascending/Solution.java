package EveryDay.Interview.ascending;

import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        String string = "Facebook";
        System.out.println(find(string));
    }

    static public char find (String string) {
       char[] charsArray = string.toLowerCase().toCharArray();
        for (int i = 1; i < charsArray.length; i++) {
            if (charsArray[i] - charsArray[i - 1] < 0) {
                return charsArray[i];
            }
        }
        return ' ';
    }
}

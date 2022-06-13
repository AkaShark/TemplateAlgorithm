package Offer.offer58_1;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    static public String reverseWords(String s) {
        String[] temp = s.split(" ");
        Collections.reverse(Arrays.asList(temp));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            if (i != temp.length - 1) {
                stringBuilder.append(temp[i]);
                if (i + 1 < temp.length - 1 && "".equals(temp[i + 1])) continue;
                stringBuilder.append(" ");
            } else {
                stringBuilder.append(temp[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        reverseWords("  hello world!  ");
    }
}

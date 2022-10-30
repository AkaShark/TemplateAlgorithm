package Task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Soultion {
    public class Main {
        public void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str1 = in.next();
            String str2 = in.next();
            check(str1, str2);
        }

        public Boolean check(String str1, String str2) {
            HashMap<Character, Integer> map1 = new HashMap<>();
            for (int i = 0; i < str1.length(); i++) {
                map1.put(str1.charAt(i), i);
            }
            HashMap<Character, Integer> map2 = new HashMap<>();
            for (int i = 0; i < str2.length(); i++) {
                map2.put(str2.charAt(i), i);
            }

            if (str1.length() != str2.length()) return false;
            int len = str1.length();

            char[] str1Chars = str1.toCharArray();
            char[] str2Chars = str2.toCharArray();

            boolean flag = true;
            for (int i = 0; i < len; i++) {
                if (str1Chars[i] != str2Chars[i]) {
                    if (flag == false) return false;
                    flag = false;
                    str1Chars[map1.get(str1Chars[i])] = str2Chars[map2.get(str1Chars[i])];
                }
            }

            return str1Chars.toString().equals(str2Chars.toString());
        }
    }
}



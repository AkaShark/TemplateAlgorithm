package Task;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class task4 {
    static ArrayList<Boolean> resultArray = new ArrayList<>();
    static char[] yuan = new char[]{'a', 'o', 'e', 'i', 'u'};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.next();
            resultArray.add(check(a));
            num --;
            if (num == 0)
                break;
        }
        in.close();

        for (int i = 0; i < resultArray.size(); i++) {
            System.out.println(resultArray.get(i));
        }
    }

    static public boolean check(String str) {
        char[] array = str.toCharArray();
        if (array.length != 3) return false;
        if (inArray(array[0])) return false;
        if (inArray(array[2])) return false;
        if (inArray(array[1])) return true;
        return false;
    }

    static public boolean inArray(char a) {
        for (int i = 0; i < yuan.length; i++) {
            if (yuan[i] == a) {
                return true;
            }
        }
        return false;
    }
}


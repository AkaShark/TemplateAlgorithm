package Task;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class task3 {
//    public class Main {
//        public void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            String inLine = new String();
//            // 注意 hasNext 和 hasNextLine 的区别
//            while (in.hasNext()) { // 注意 while 处理多个 case
//                inLine = in.next();
//            }
//            ArrayList<String> results = new ArrayList<>();
//            for (int i = 0; i < inLine.length(); i++) {
//                for (int j = 0; j < inLine.length(); j++) {
//                    // 子串
//                    String subString = inLine.substring(i, j);
//                }
//            }
//
//        }
//        private boolean checkGoodStr(String subStr) {
//
//        }
//    }

    public class Main {
        public  void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            while (in.hasNextInt()) { // 注意 while 处理多个 case
                int a = in.nextInt();
                result(a / 2);
            }
        }

        public void result(Integer index) {
            index = index + 1;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(numberToLetter(index));
            stringBuffer.append('a');
            System.out.println(stringBuffer.toString().toLowerCase(Locale.ROOT));
        }
    }

    private String numberToLetter(int num) {
        if (num <= 0) return null;
        String letter = "";
        num --;
        do {
            if (letter.length() > 0) {
                num --;
            }
            letter = ((char) (num % 26 + (int) 'A')) + letter;
            num = (int)(num - num % 26) / 26;
        }while (num > 0);
        return letter;
    }

}

package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Soultion {
    public class Main {
        public void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            int skills = in.nextInt();
            int nums = in.nextInt();
            int times = in.nextInt();
            int index = 0;

            int res = 0;
            int[] array = new int[skills];
            int skilIndex = 0;
            while (in.hasNextInt()) { // 注意 while 处理多个 case
                if (skilIndex == skills - 1) break;
                array[skilIndex] = in.nextInt();
                skilIndex++;
            }
            in.close();

            Arrays.sort(array);
            int time = 0;
            while (index < nums) {
                if (index == 0) {
                    res = array[skills - 1] * times;
                    index += times;
                    time = 1;
                } else {
                    if (time == 1) {
                        res += array[skills - 2];
                        index += 1;
                        time = 0;
                    } else {
                        if (times < (nums - index)) {
                            res += array[skills - 1] * times;
                            index += times;
                            time = 1;
                        } else {
                            res += array[skills - 1] * (nums - index);
                            index += (nums - index);
                            time = 1;
                        }
                    }
                }

            }
            System.out.println(res);
        }
    }
}



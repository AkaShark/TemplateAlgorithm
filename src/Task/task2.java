package Task;
import java.util.Scanner;

class Soultion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串（nextLine）：");
        String str = sc.nextLine(); //读取一行数据
        String arr[] = str.split("\\s+");//正则匹配所有空白字符，并以空白字符分割

        int a[] = new int[arr.length];

        for(int j = 0; j < a.length; j++){
            a[j] = Integer.parseInt(String.valueOf(arr[j]));
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

public class task2 {
    public static void main(String[] args) {

    }
}

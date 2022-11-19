package Task;

public class StringLenTask {
     static public int getLength(String str, int k) {
         StringBuilder resultStringBuilder = new StringBuilder(str);
         for (int j = 0; j < k; j++) {
             StringBuilder stringBuilder = new StringBuilder();
             char[] chars = resultStringBuilder.toString().toCharArray();
             for (int i = 0; i < chars.length; i++) {
                 if (Character.isUpperCase(chars[i])) {
                     stringBuilder.append(chars[i]);
                 }
                 stringBuilder.append(chars[i]);
             }
             resultStringBuilder = stringBuilder;
         }
         System.out.println(resultStringBuilder.length());
         return resultStringBuilder.length();
     }

    public static void main(String[] args) {
        getLength("sABc", 2);
    }
}

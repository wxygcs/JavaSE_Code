package lesson_01;
/*
    StringBuilder构造方法：
        public StringBuilder()：创建一个空白可变字符串对象，不含有任何内容
        public StringBuilder(String str)：根据字符串的内容，来创建可变字符串对象
 */

public class StringBuilderDemo_01 {
    public static void main(String[] args) {
        //创建一个空白可变字符串对象
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        System.out.println(sb.length());

        //创建一个有内容的可变字符串对象
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb2);
        System.out.println(sb2.length());
    }
}

package lesson_02;
/*
    StringBuilder 转换为 String
        public String toString()：通过 toString() 就可以实现把 StringBuilder 转化为 String

    String 转换为 StringBuilder
        public StringBuilder(String s)：通过构造方法就可以实现把 String 转换为 StringBuilder
 */
public class StringBuilder_00 {
    public static void main(String[] args) {

        //通过 toString() 就可以实现把 StringBuilder 转化为 String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        String s = sb.toString();
        System.out.println(s);

        //通过构造方法就可以实现把 String 转换为 StringBuilder
        String s2 = "hello";
        StringBuilder sb2 = new StringBuilder(s2);
        System.out.println(sb2);
    }
}

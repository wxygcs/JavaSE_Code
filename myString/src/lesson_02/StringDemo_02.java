package lesson_02;
/*
    使用 == 作比较：
        基本类型：比较的是数据值是否相同
        引用类型：比较的是地址值是否相同

    public boolean equals(Object anObject):
        将此字符串与指定对象进行比较。
        由于我们比较的是字符串对象，所以参数直接传递一个字符串
 */

public class StringDemo_02 {
    public static void main(String[] args) {

        char[] chs = {'a','b','c'};
        String a = new String(chs);
        String b = new String(chs);

        String c = "abc";
        String d = "abc";

        //比较地址是否相同
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);

        System.out.println("------");

        //比较字符串内容是否相同
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(d));
    }
}

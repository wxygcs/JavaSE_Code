package lesson_02;
/*
    String构造方法：
        public String():创造一个空白字符串对象，不含任何内容
        public String(char[] chs):根据字符数组的内容，来创建字符串对象
        public String(byte[] bys):根据字节数组的内容，来创建字符串对象
        String s = "abc";   直接赋值的方式创建字符串对象，内容就是abc
 */
public class StringDemo_01 {
    public static void main(String[] args) {
        //public String():创造一个空白字符串对象，不含任何内容
        String a = new String();
        System.out.println("a="+a);

        //public String(char[] chs):根据字符数组的内容，来创建字符串对象
        char[] chs = {'a','b','c','d'};
        String b = new String(chs);
        System.out.println("b="+b);

        //public String(byte[] bys):根据字节数组的内容，来创建字符串对象
        byte[] bys = {97,98,99};    //97对应的字符串是a，所以输出的为a
        String c = new String(bys);
        System.out.println("c="+c);

        //String s = "abc";   直接赋值的方式创建字符串对象，内容就是abc
        String d = "你好";
        System.out.println("d="+d);

    }
}

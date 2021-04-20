package lesson_04;

import java.util.Scanner;

/*
    需求：
        定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果。
        例如：键盘录入abc，输出结果cba
 */
public class StringBuilderDemo_01 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();

        //调用方法
        String a = reverseS1(s);

        System.out.println(a);

    }

    //定义方法，反转字符串
    public static String reverseS1(String a) {
//        StringBuilder sb = new StringBuilder(a);
//        StringBuilder sb2 = sb.reverse();
//        String s = sb2.toString();
//        return s;
        //用链式编程
        return new StringBuilder(a).reverse().toString();
    }
}

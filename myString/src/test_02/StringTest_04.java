package test_02;

import java.util.Scanner;

/*
    需求：
        定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果。
        例如，键盘录入abc，输出结果cba
 */
public class StringTest_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String a = sc.nextLine();
        System.out.println(abToBa(a));
    }

    public static String abToBa(String a) {
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        return b;
    }
}

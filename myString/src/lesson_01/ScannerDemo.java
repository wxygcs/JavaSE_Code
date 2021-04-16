package lesson_01;

import java.util.Scanner;

/*
    Scanner:
        用于键盘录入数据（基本数据类型，字符串数据）

    public Strinhg nextLine();
        获取键盘录入字符串数据。
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a);
    }
}

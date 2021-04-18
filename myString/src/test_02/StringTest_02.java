package test_02;
/*
    需求：
        键盘录入一个字符串，统计该字符串中大小写字母字符、数字字符出现的次数（不考虑其它字符）
    思路：
        1.键盘录入一个字符串，用Scanner实现
        2.要统计三种类型的字符个数，要定义三个统计变量，初始值都是0
        3.遍历该字符串，得到每一个字符
        4.判断ch该字符是属于哪种类型，然后对应的统计变量+1
            大写字母：ch>='A' && ch<='Z'
            小写字母：ch>='a' && ch<='z'
            数字：ch>='0' && ch<='9'
        5.输出三种类型字符个数
 */

import java.util.Scanner;

public class StringTest_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String a = sc.nextLine();

        int big = 0;
        int small = 0;
        int number = 0;

        for(int i = 0 ; i < a.length() ; i++){

            if(a.charAt(i)>='A'&&a.charAt(i)<='Z'){
                big++;
            }else if (a.charAt(i)>='a'&&a.charAt(i)<='z'){
                small++;
            }else if (a.charAt(i)>='0'&&a.charAt(i)<='9'){
                number++;
            }
        }
        System.out.println("大写字母有"+big+"个");
        System.out.println("小写字母有"+small+"个");
        System.out.println("数字有"+number+"个");
    }
}

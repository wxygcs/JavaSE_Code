package lesson_02;

import java.util.ArrayList;

/*
    需求：
        创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
    思路：
        1.创建一个集合对象
        2.往集合中添加字符串对象
        3.遍历集合，首先要能获取到集合中每个元素，通过 get(int index) 方法实现
        4.遍历集合，其次要能获取到集合的长度，通过 size() 方法实现
        5.遍历的通用格式
 */
public class myArrayListDemo_01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Hello");
        array.add("World");
        array.add("2021");
        System.out.println(array);

        for (int i = 0 ; i < array.size() ; i++){
            String s = array.get(i);
            System.out.println(s);
        }

    }
}

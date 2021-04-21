package lesson_02;

import java.util.ArrayList;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 */
public class myArrayListDemo_02 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("王大炮");
        students.add("王富贵");
        students.add("猴赛雷");
        System.out.println(students);

        for (int i = 0 ; i < students.size() ; i++){
            String s = students.get(i);
            System.out.println(s);
        }
    }
}

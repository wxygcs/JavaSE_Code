package test_02;

import java.util.ArrayList;
import java.util.Scanner;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合，
    学生的姓名和年龄来自于键盘录入。
 */
public class StudentDemo {
    public static void main(String[] args) {

        ArrayList<Student> student = new ArrayList<>();

/*
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String age1 = sc.nextLine();
        Student s1 = new Student();
        s1.setName(name1);
        s1.setAge(age1);

        String name2 = sc.nextLine();
        String age2 = sc.nextLine();
        Student s2 = new Student(name2,age2);
        s2.setName(name2);
        s2.setAge(age2);

        String name3 = sc.nextLine();
        String age3 = sc.nextLine();
        Student s3 = new Student(name3,age3);
        s3.setName(name3);
        s3.setAge(age3);

        student.add(s1);
        student.add(s2);
        student.add(s3);
*/
        //用方法来改进
        addStudent(student);
        addStudent(student);
        addStudent(student);

        for (int i = 0 ; i < student.size() ; i++){
            Student s = student.get(i);
            System.out.println(s.getName()+s.getAge());
        }
    }

    //返回值类型：void
    //参数：ArrayList<Student> array
    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        array.add(s);
    }
}

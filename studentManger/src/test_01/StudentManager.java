package test_01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //创建集合对象，用来存储学生数据
        ArrayList<Student> arrayStudent = new ArrayList<Student>();

        //用循环回到主界面
        while (true) {
            //用输出语句完成主界面的编写
            System.out.println("--------欢迎使用学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("---------------------------------");
            System.out.println("请输入你的选择：");

            //用Scanner实现键盘的录入数据
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("选择错误，请重新输入：");
            } else {

                //用switch语句完成操作的选择
                switch (choice) {
                    case 1:
                        //System.out.println("请添加学生学号：");
                        addStudent(arrayStudent);
                        break;
                    case 2:
                        System.out.println("请输入要删除的学生学号：");
                        break;
                    case 3:
                        System.out.println("请输入要修改的学生学号：");
                        break;
                    case 4:
                        //System.out.println("查看所有学生");
                        show(arrayStudent);
                        break;
                    case 5:
                        System.out.println("感谢使用！");
                        System.exit(0); //JVM退出
                }
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);

        //显示提示信息，提示要输入何种信息
        System.out.println("请输入学生学号：");
        String newNumber = sc.nextLine();
        System.out.println("请输入学生姓名：");
        String newName = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String newAge = sc.nextLine();
        System.out.println("请输入学生居住的：");
        String newAddress = sc.nextLine();

        //创建学生对象
        Student newStudent = new Student();

        //把键盘录入的数据赋值给学生对象的成员变量
        newStudent.setNumber(newNumber);
        newStudent.setName(newName);
        newStudent.setAge(newAge);
        newStudent.setAddress(newAddress);

        //将学生对象添加到集合中
        array.add(newStudent);

        //给出添加成功的提示
        System.out.println("添加成功！");

    }

    //修改学生

    //查看所有学生信息
    public static void show(ArrayList<Student> array){
        //使用"\t"表示tab键的位置
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住的");

        for(int i = 0 ; i < array.size() ; i++){
            Student a = array.get(i);
            System.out.println(a.getNumber()+"\t\t"+a.getName()+"\t"+a.getAge()+"岁\t"+a.getAddress());
        }
    }
}

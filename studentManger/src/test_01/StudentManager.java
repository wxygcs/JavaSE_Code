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
                        //System.out.println("请输入要删除的学生学号：");
                        delete(arrayStudent);
                        break;
                    case 3:
                        //System.out.println("请输入要修改的学生学号：");
                        change(arrayStudent);
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
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        //为了让newNumber能在while外被调用，定义在前
        //用while循环来完善学号重复情况下再次输入
        String newNumber;
        while (true) {
            System.out.println("请输入学生学号：");
            newNumber = sc.nextLine();

            if (isUsed(array, newNumber) == true) {
                System.out.println("输入的学号已经存在！请重新输入：");
            } else {
                break;
            }
        }

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

    //判断学号是否已经被使用
    public static boolean isUsed(ArrayList<Student> array, String number) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNumber().equals(number)) {
                return true;
            }
        }
        return false;
    }

    //删除学生
    public static void delete(ArrayList<Student> array) {
        //显示提示信息
        System.out.println("请输入要删除的学生学号：");

        //键盘录入要删除的学生学号
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        //遍历集合，将对应学生对象从集合中删除
        //删除前先判断输入的学号是否存在
        int index = -1;     //用-1来初始化，在for循环里用index表示索引
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            //字符串的内容是否相同用 .equals()
            if (s.getNumber().equals(number)) {
                //输入的学号和遍历到的其中一个的学号相同，就把索引值赋值给index
                index = i;
                break;
            }
        }
        //判断index是否发生变化，因为索引不可能是负数，如果index还是-1，那就说明没有对应的学号存在
        if (index == -1) {
            System.out.println("输入的学号不存在！");
        } else {
            array.remove(index);
            //给出删除成功提示
            System.out.println("删除成功！");
        }
    }

    //查看所有学生信息
    public static void show(ArrayList<Student> array) {
        //判断集合中是否有数据
        if (array.size() == 0) {
            System.out.println("无信息，请先添加内容！");
        } else {
            //使用"\t"表示tab键的位置
            System.out.println("学号\t\t姓名\t\t年龄\t\t居住的");

            for (int i = 0; i < array.size(); i++) {
                Student a = array.get(i);
                System.out.println(a.getNumber() + "\t\t" + a.getName() + "\t" + a.getAge() + "岁\t" + a.getAddress());
            }
        }
    }

    //修改学生
    public static void change(ArrayList<Student> array) {
        //显示提示信息
        System.out.println("请输入要修改的学生学号：");
        //键盘录入要修改的学生学号
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //遍历集合，修改对应的学生信息
        //先判断输入的学号是否存在
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student a = array.get(i);
            if (a.getNumber().equals(s)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("输入的学号不存在！");
        } else {
            //输入修改后的信息
            System.out.println("请输入修改后的学号：");
            String newNumber = sc.nextLine();
            System.out.println("请输入修改后的姓名：");
            String newName = sc.nextLine();
            System.out.println("请输入修改后的年龄：");
            String newAge = sc.nextLine();
            System.out.println("请输入修改后的居住的：");
            String newAddress = sc.nextLine();

            //创建学生对象
            Student stu = array.get(index);
            stu.setNumber(newNumber);
            stu.setName(newName);
            stu.setAge(newAge);
            stu.setAddress(newAddress);

            //修改成功的提示
            System.out.println("修改成功！");
        }
    }
}

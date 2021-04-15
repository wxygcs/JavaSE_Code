package test_01;
/*
    定义一个学生类，然后定义一个学生测试，在学生测试中通过对象完成成员变量和成员方法的使用
        成员变量：姓名，年龄
        成员方法：学习，做作业
 */
public class Student {
    String name;
    int age;

    public void study(){
        System.out.println("学习");
    }
    public void work(){
        System.out.println("做作业");
    }
}

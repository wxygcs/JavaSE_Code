package test_01;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student a = new Student();

        //获取对象的地址
        System.out.println(a);

        //使用成员变量
        a.name = "小明";
        a.age = 12;
        System.out.println(a.name);
        System.out.println(a.age);

        //使用成员方法
        a.study();
        a.work();
    }
}

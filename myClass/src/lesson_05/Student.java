package lesson_05;
/*
        如果没有定义构造方法，系统会默认给出无参数构造方法
        如果定义了构造方法，系统将不再提供默认的构造方法

        如果定义了带参构造方法，还要使用无参构造方法，就必须手动写一个无参数构造方法

        无论是否使用，都建议手动写一个无参数构造方法
 */
public class Student {
    private String name;
    private int age;

    //构造方法
    public Student(){ }
    public Student(String name){
        this.name = name;
    }
    public Student(int age){
        this.age = age;
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("姓名："+name+"，年龄："+age+"岁");
    }
}

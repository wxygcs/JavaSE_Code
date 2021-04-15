package lesson_04;
/*
    学生类
    构造方法：
        作用：创建对象
        功能：完成对象数据的初始化
    格式：（修饰符一般用 public）
        修饰符 类名（参数）{
        }

 */
public class Student {
    private String name;
    private int age;

    //构造方法
    public Student(){
        System.out.println("无参构造方法");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println("姓名："+name+"，年龄："+age+"岁");
    }
}

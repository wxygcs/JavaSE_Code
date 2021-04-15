package lesson_03;

/*
    学生类，包含姓名、年龄，并且能显示这些信息
 */
public class Student {

    private String name;
    private int age;

    //成员变量和方法的形参同名时，用this修饰成员变量
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void shouInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age + "岁");
    }
}

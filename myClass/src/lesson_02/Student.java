package lesson_02;

/*
    学生类，包含姓名、年龄，并且能显示这些信息
 */
public class Student {
    //用private修饰成员变量
    private String name;
    private int age;

    //private修饰过的成员变量，用get/set方法来获取/设置变量的值
    public void setName(String a) {
        name = a;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void shouInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age + "岁");
    }
}

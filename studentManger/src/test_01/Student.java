package test_01;

/*
    定义学生类，包含学号、姓名、年龄、居住地。
 */
public class Student {
    //成员变量
    private String number;
    private String name;
    private String age;
    private String address;

    //alt+insert 可以直接生成构造方法和成员方法
    //构造方法
    public Student() {
    }

    public Student(String number, String name, String age, String address) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //成员方法
    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

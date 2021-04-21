package test_01;
/*
    创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 */
public class Students {
    private String name;
    private int age;

    public Students(){};
    public Students(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

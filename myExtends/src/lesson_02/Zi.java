package lesson_02;

public class Zi extends Fu {
    public int age = 20;

    public void shou() {
        int age = 10;

        //访问局部变量age
        System.out.println(age);

        //访问本类的成员变量age，用this
        System.out.println(this.age);

        //访问父类的成员变量age，用super
        System.out.println(super.age);
    }

}

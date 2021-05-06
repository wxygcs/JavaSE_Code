package lesson_03;
/*
    因为子类会继承父类的数据，可能还会用到父类的数据，
    所以子类初始化之前，一定会先完成父类数据的初始化。
 */

public class Demo {
    public static void main(String[] args) {
        Zi z = new Zi();

        System.out.println("------");

        Zi z2 = new Zi(10);

    }
}

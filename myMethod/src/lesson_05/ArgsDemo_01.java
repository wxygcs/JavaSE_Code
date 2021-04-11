package lesson_05;
/*
    对于基本数据类型的参数，形式参数的改变，不影响实际参数的值。
 */

public class ArgsDemo_01 {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(a);
        change(a);
        System.out.println(change(a));
        System.out.println(a);
    }

    public static int change(int a){
        a = 200;
        return a;
    }
}

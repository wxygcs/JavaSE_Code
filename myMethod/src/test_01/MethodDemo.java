package test_01;
/*
    设计一个方法，用于打印两个数中的较大数
 */
public class MethodDemo {
    public static void getMax(){
        int a = 1;
        int b = 2;
        int max = a > b ? a : b;
        System.out.println(max);
    }

    public static void main(String[] args) {
        getMax();
    }
}

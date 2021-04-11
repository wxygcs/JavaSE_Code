package lesson_04;
/*
    方法重载：
        多个方法在同一类中
        多个方法具有相同的方法名
        多个方法的参数不相同，包括类型不同或者数量不同

        与返回值无关
        在调用的时候，java虚拟机会通过参数的不同来区分同名的方法
 */
public class MethodDemo {
    public static void main(String[] args) {
        double x = sum(14.2,22);
        System.out.println(x);

        int y = sum(2,3,4);
        System.out.println(y);

        int z = sum(2,9);
        System.out.println(z);
    }

    //求两个int类型数据和的方法
    public static int sum(int a,int b){
        return a + b;
    }
    //求两个double类型数据和的方法
    public static double sum(double a,double b){
        return a + b;
    }
    //求三个int类型数据和的方法
    public static int sum(int a,int b,int c){
        return a + b + c;
    }
}

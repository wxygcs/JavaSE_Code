package test_03;
/*
    设计一个方法可以获取两个数的较大值，数据来自于参数
 */
public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(getMax(10,20));
    }

    public static int getMax(int a,int b){
        if(a > b){
            return a;
        }else {
            return b;
        }
    }
}

package test_02;
/*
    设计一个方法用于打印两个数中的较大值，数据来自于方法参数
 */
public class MethodDemo {
    public static void main(String[] args) {
        getMax(12,23);
        getMax(10,10);

        int x = 22;
        int y = 21;
        getMax(x,y);
    }

    public static void getMax(int a,int b){
        if(a > b){
            System.out.println(a);
        }else if(a < b){
            System.out.println(b);
        }else {
            System.out.println("两个数一样大");
        }
    }
}

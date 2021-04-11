package test_04;
/*
    使用方法重载的思想，设计比较两个整数是否相同的方法，兼容全整数类型（byte，short，int，long）
 */
public class MethodDemo {
    public static void main(String[] args) {
        boolean i = isSame(1212,2222);
        System.out.println(i);

        //如果要强制用其他数据类型的方法，需要强制转换
        System.out.println(isSame((byte) 1212,(byte) 2222));
        System.out.println(isSame((long) 1212,(long) 1212));
        System.out.println(isSame((short) 1212,(short) 2222));

    }

    public static boolean isSame(byte a,byte b){
        /*if(a == b){
            return true;
        }else {
            return false;
        }*/
        return a == b ;
    }
    public static boolean isSame(int a,int b){
        return a == b ;
    }
    public static boolean isSame(long a,long b){
        return a == b ;
    }
    public static boolean isSame(short a,short b){
        return a == b ;
    }
}

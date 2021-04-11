package lesson_01;
/*
    数组：是一种用于存储多个相同类型数据的存储模型

    定义格式：
        数据类型[] 数组名;
        例：int[] arr;

    数组初始化：
        1:所谓初始化就是为数组中的数组元素分配内存空间，并为每个数组元素赋值
        2:分为 动态初始化 和 静态初始化

    动态初始化：
        初始化时只指定数组长度，由系统为数组分配初始值
        格式：数据类型[] 变量名 = new 数据类型[数组长度];
        例：int[] arr = new int[3];
*/
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        /*
        左边：
            int：说明数组中的元素类型是int类型
            []：说明这是一个数组
            arr：这是数组的名称
        右边：
            new：为数组申请内存空间
            int：说明数组中的元素类型是int类型
            []：说明这是一个数组
            3：数组的长度，其实就是这个数组中的元素个数
         */

        //输出数组名
        System.out.println(arr);    //[I@119d7047，这是该数组对应内存空间的地址值

        //输出数组中的元素,初始值是由系统分配的
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

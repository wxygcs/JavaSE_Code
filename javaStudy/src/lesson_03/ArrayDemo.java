package lesson_03;
/*
    静态初始化：
    初始化时指定每个数组元素的初始值，有系统决定数组的长度

    格式：数据类型[] 变量名 = new 数据类型[]{数据1,数据2,数据3,……};
    范例：    int[]   arr = new    int[]{1,2,3};

    简化格式：数据类型[] 变量名 = {数据1,数据2,数据3,……};
    返利：       int[]   int = {1,2,3};
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //int[] arr = new int[]{1,2,3};
        int[] arr = {1,2,3};

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

package example;
/*
    数组遍历

    要求：
        设计一个方法用于数组遍历，要求遍历的结果是在同一行上的，例如：[1, 2, 3, 4, 5]
    思路：
        1.因为要求结果在一行上输出，所以这里需要学习一个新的输出语句System.out.print("内容");
                System.out.println("内容"); 输出内容并换行
                System.out.print("内容"); 输出内容不换行
                System.out.println(); 直接起到换行作用
        2.定义一个数组，用静态初始化完成元素初始化
        3.定义一个方法，用数组遍历通用格式对数组进行遍历
        4.用输出语句修改遍历操作
        5.调用遍历方法
 */
public class MethodTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        array(arr);
    }

    public static void array(int[] arr){
        System.out.print('[');
        int i = arr.length;
        for(int j = 0;j < i;j++) {
            if(j == i-1){
                System.out.print(arr[j]);
            }else {
                System.out.print(arr[j] + ", ");
            }
        }
        System.out.println(']');
    }
}

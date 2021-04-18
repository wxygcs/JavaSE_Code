package test_02;
/*
    需求：
        定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
    调用该方法，并在控制台输出结果。

 */

public class StringTest_03 {
    /*定义方法，把数组中的元素遍历并拼接成字符串
        返回值的类型：String
        参数：int[] arr
     */
    public static String chars(int[] arr){
        String a = "[";
        for(int i = 0;i<arr.length;i++){
            if(i == arr.length-1){
                a += arr[i];
            } else {
                a += arr[i];
                a += ", ";
            }
        }
        a += "]";
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(chars(arr));
    }
}

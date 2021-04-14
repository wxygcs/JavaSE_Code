package test_05;
/*
    设计一个方法用于获取数组中元素的最大值，调用方法输出结果。
 */

public class MethodTest {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,0};

        System.out.println(getMax(arr));
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }else {
                max = max;
            }
        }
        return max;
    }
}

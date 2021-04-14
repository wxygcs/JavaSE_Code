package test_01;

/*
    反转
        已知一个数组arr={19,28,37,46,50};用程序实现把数组中的元素值交换顺序，
        交换后的数组arr={50,46,37,28,19};并在控制台输出交换后的元素。

 */
public class test_09 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

/*        int i = 0;
        int x = arr.length -1;
        System.out.print('[');
        for(i = arr.length -1;i>0 ;i--){
            arr[x] = arr[i];
            System.out.print(arr[x] + ",");
        }
        System.out.print(arr[0]);
        System.out.println(']');*/

        //调用两个方法
        ysjh(arr);
        array(arr);
    }

    //用两种方法来完成
    //定义元素交换的方法
    public static void ysjh(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int a = arr[start];
            arr[start] = arr[end];
            arr[end] = a;
        }
    }

    //定义遍历数组的方法
    public static void array(int[] arr) {
        System.out.print("[");
        for (int a = 0; a < arr.length; a++) {
            if (a == arr.length - 1) {
                System.out.print(arr[a]);
            } else {
                System.out.print(arr[a] + ", ");
            }
        }
        System.out.println("]");
    }
}

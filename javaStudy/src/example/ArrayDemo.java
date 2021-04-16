package example;
/*
    获取最值：
        获取数组中的最大值/最小值
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {15,88,54,21,99,5};

        //定义max，存储最大值，将arr中的第一个元素设置为最大值的初始值
        int max = arr[0];

        //用for循环遍历除第一个元素以外的其它元素
        for(int x = 1 ; x < arr.length ; x++){

            //用if语句将max和遍历到的元素作比较，如果该元素大于max，就把这个元素赋值给max
            if(arr[x] > max){
                max = arr[x];
            }
        }
        System.out.println("最大值是：" + max);

        //同理得到最小值
        int min = arr[0];
        for(int a = 1 ; a < arr.length ; a++){
            if(arr[a] < min){
                min = arr[a];
            }
        }
        System.out.println("最小值是：" + min);
    }
}

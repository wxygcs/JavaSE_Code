package test_01;
/*
    有一对兔子，从出生后的第2个月起每个月都生一对兔子，小兔子长到第三个月开始每个月又生一对兔子，
    假如兔子都不死，问第二十个月的兔子对数是多少？

    思路：
        每个月的兔子数量为：
            第一个月：1
            第二个月：1
            第三个月：2
            第四个月：3
            第五个月：5
            第六个月：8
            ...
        找规律：从第三个月开始，每个月的数量为前两天的和。
 */
public class test_04 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2;i < arr.length ; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        System.out.println("第二十个月的数量为：" + arr[19]);
    }
}

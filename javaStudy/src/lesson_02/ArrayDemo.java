package lesson_02;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[2];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        arr[0] = 100;
        arr[1] = 200;

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        int[] arr2 = new int[3];
        System.out.println(arr2);
        //第二个数组指向第一个数组
        arr2 = arr;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        //System.out.println(arr2[2]);  arr和arr2指向相同内存后，数组长度也将一致

        arr2[0] = 123;
        arr2[1] = 321;
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
        System.out.println(arr[1]);
        System.out.println(arr2[1]);

    }
}

package test_01;

import java.util.Scanner;

/*
    查找
        已知一个数组arr={19,28,37,46,50};键盘录入一个数据，
        定义一个方法用于查找该数据在数组中的索引，并输出找到的索引值。

    分析
        键盘录入的数据与数组中的每一个元素作比较，如果相同则输出对应的索引值
        假如录入的数据不在数组中，我们一般都是返回一个负数，经常用-1来表示。
 */
public class test_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int i = sc.nextInt();
        int[] arr = {19,28,37,46,50};

        System.out.println(getNub(i,arr));

/*        int j = -1;
        for(int x = 0;x < arr.length;x++){
            if (arr[x] == i) {
                j = x;
                break;
            }
        }
        System.out.println(j);*/
    }

    public static int getNub(int a,int[] arr){
        int num = -1;
        for (int i = 0;i < arr.length;i++){
            if (arr[i] == a){
                return num=i;
            }
        }
        return num;
    }
}

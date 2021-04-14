package test_01;

import java.util.Scanner;

/*
    在竞赛中，有6个评委给选手打分，分数为0-100的整数分。
    选手最后得分为：去掉一个最高分和一个最低分，剩下得分的平均值（不考虑小数部分）。
 */
public class test_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请第" + (i + 1) + "个评委打分：");
            int point = sc.nextInt();
            if (point < 0 || point > 100) {
                System.out.println("打分不符规则！");
                i = i - 1;
            } else {
                arr[i] = point;
            }
        }
        array(arr);
        int a = getSmall(arr);
        int b = getMax(arr);
        int c = getSum(arr);
        int average = (c - a - b) / (arr.length - 2);
        System.out.println("最低分" + a);
        System.out.println("最高分" + b);
        System.out.println("总分" + c);
        System.out.println("平均分" + average);

    }

    //定义获得最低分的方法
    public static int getSmall(int[] arr) {
        int small = arr[0];
        for (int a = 1; a < arr.length; a++) {
            if (arr[a] < small) {
                small = arr[a];
            }
        }
        return small;
    }

    //定义获得最高分的方法
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int a = 1; a < arr.length; a++) {
            if (arr[a] > max) {
                max = arr[a];
            }
        }
        return max;
    }

    //定义获得总分的方法
    public static int getSum(int[] arr) {
        int sum = arr[0];
        for (int a = 1; a < arr.length; a++) {
            sum += arr[a];
        }
        return sum;
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

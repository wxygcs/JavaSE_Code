package test_01;
/*
    输入星期数，显示今天的减肥活动
        周一：跑步
        周二：游泳
        周三：慢走
        周四：单车
        周五：拳击
        周六：爬山
        周日：好好吃一顿
 */
import java.util.Scanner;
public class test_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int i = sc.nextInt();
        if(i == 1){
            System.out.println("跑步");
        }else if(i == 2){
            System.out.println("游泳");
        }else if(i == 3){
            System.out.println("慢跑");
        }else if(i == 4){
            System.out.println("单车");
        }else if(i == 5){
            System.out.println("拳击");
        }else if(i == 6){
            System.out.println("爬山");
        }else if(i == 7){
            System.out.println("好好吃一顿");
        }else {
            System.out.println("输入的星期数错误！");
        }
    }
}

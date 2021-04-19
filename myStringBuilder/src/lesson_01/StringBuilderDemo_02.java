package lesson_01;
/*
    StringBuilder 的添加和反转方式
        public StringBuilder append(任意类型)：添加数据，并返回对象本身
        public StringBuilder reverse()：返回相反的字符序列
 */

public class StringBuilderDemo_02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

//        sb.append("world");
//        sb.append(123);
//        sb.append('w');
        //链式编程
        sb.append("world").append(123).append('w');

        System.out.println(sb);

        //反转方法
        sb.reverse();
        System.out.println(sb);
    }
}

package lesson_01;
/*
    ArrayList 构造方法：
        public ArrayList()：创造一个空的集合对象
    ArrayList 添加方法：
        public boolean add(E e)：将指定的元素追加到此集合的末尾
        public void add(int index,E element)：在此集合的指定位置插入指定的元素
 */

import java.util.ArrayList;

public class ArrayListDemo_01 {
    public static void main(String[] args) {
        //创建一个空白集合
        ArrayList<String> array = new ArrayList<String>();

        array.add("Hello");
        array.add("world");
        array.add("你好");

        //public boolean add(E e)：输出的是true或false，表示是否插入成功
        System.out.println(array.add("2021"));

        System.out.println(array);

        array.add(1,"haha");
        System.out.println(array);

    }
}

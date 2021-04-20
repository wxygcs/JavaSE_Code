package lesson_01;

import java.sql.SQLOutput;
import java.util.ArrayList;

/*
    ArrayList 常用方法：
        public boolean remove(Object o)：删除指定的元素，返回删除是否成功
        public E remove(int index)：删除指定索引处的元素，返回被删除的元素
        public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        public int size()：返回集合中的元素的个数
 */
public class ArrayListDemo_02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Hello");
        array.add("World");
        array.add("2021");
        array.add("www");
        System.out.println(array);

        //array.remove("www");  返回的是boolean值,是否删除成功。
        System.out.println(array.remove("www"));
        System.out.println(array);

        //array.remove(1);  返回的是被删除的元素。
        System.out.println(array.remove(1));
        System.out.println(array);

        //array.set(0,"你好");    返回的是被修改的元素。
        System.out.println(array.set(0,"你好"));
        System.out.println(array);

        //获得索引位置的元素
        System.out.println(array.get(1));

        //返回元素个数。
        int i = array.size();
        System.out.println(i);
    }
}

package lesson_05;
/*
    遍历：获取数组中的每一个元素输出在控制台
    获取数组元素长度：数组名.length
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};

        //获取arr的数组长度
        int i = arr.length;
        System.out.println(i);

        //遍历数组
        for(int j = 0 ; j < i ; j++){
            System.out.println(arr[j]);
        }

        //综合上述得出通用遍历格式
        for(int x = 0 ; x < arr.length ; x++){
            System.out.println(arr[x]);
        }
    }
}

package lesson_03;
/*
    带返回值方法的定义和调用
    定义格式：
        public static 数据类型 方法名(参数){
            return 数据;
        }
    调用格式：
        1.方法名(参数);
        2.数据类型 变量名 = 方法名(参数);
 */
public class MethodDemo {
    public static void main(String[] args) {
        //调用方法
        //isEvenNumber(10);

        //由于return返回值并未被使用，所以需要定义一个参数来观察该方法的结果
        boolean a = isEvenNumber(11);
        System.out.println(a);

        System.out.println(isEvenNumber(10));


    }

    //定义一个方法，接收一个参数，判断该参数是否为偶数，并返回真假值。
    public static boolean isEvenNumber(int number){
        if(number%2 == 0){
            return true;
        }else {
            return false;
        }
    }
}

package lesson_02;
/*
    带参数方法的定义和调用
    定义格式：
        public static void 方法名(参数){......}

    调用格式：
        方法名(参数);
 */
public class MethdDemo {
    public static void main(String[] args) {
        //常量值调用
        isEvenNumber(20);

        //变量的调用
        int a = 11;
        isEvenNumber(a);
    }

    //定义一个方法，用于接收一个参数，判断参数是不是偶数
    public static void isEvenNumber(int number){
        if(number%2 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

package lesson_01;
/*
    方法：是将具有独立功能的代码块组织成一个整体，使其具有特殊功能的代码集
    定义格式：
        public static void 方法名(){
            方法体;
        }

    调用方法：
        方法名:();
 */
public class MethodDemo {
    public static void main(String[] args) {

        //调用方法。java中在main里调用方法，可以调用之后定义的方法
        evenNumber();
    }

    //定义一个方法，要求在方法中定义一个变量，判断这个数是不是偶数
    public static void evenNumber(){
        int i = 10;
        if(i%2 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

package lesson_03;

public class Fu {
    /*如果父类没有无参构造方法，推荐手动给出构造方法
    public Fu(){}
     */

    public Fu(){
        System.out.println("调用父类无参构造方法");
    }

    public Fu(int age){
        System.out.println("调用父类带参构造方法");
    }
}

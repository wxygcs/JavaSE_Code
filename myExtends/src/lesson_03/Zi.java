package lesson_03;

public class Zi extends Fu{
    /*
    实际隐藏了一个
    super();

    如果父类没有无参构造方法，可以调用带参构造方法
    super(10);
     */
    public Zi(){
        System.out.println("调用子类无参构造方法");
    }
    public Zi(int age){
        System.out.println("调用子类带参构造方法");
    }
}

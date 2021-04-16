package example;

public class StudentdDemo {
    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student("王大炮",12);
        a.show();
        b.show();

        a.setName("王富贵");
        a.setAge(25);
        a.show();
    }
}

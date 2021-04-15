package lesson_05;

public class StudentDemo {
    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student("小红");
        Student c = new Student(15);
        Student d = new Student("王大炮",20);

        a.show();
        b.show();
        c.show();
        d.show();
    }
}

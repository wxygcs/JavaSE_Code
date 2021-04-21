package test_01;

import java.util.ArrayList;

public class StudentsDemo {
    public static void main(String[] args) {
        Students a = new Students("王大炮",18);
        Students b = new Students("二狗子",19);
        Students c = new Students("李铁柱",20);

        ArrayList<Students > array = new ArrayList<>();
        array.add(a);
        array.add(b);
        array.add(c);
        //System.out.println(array);

        for (int i = 0 ; i < array.size() ; i++){
            Students s = array.get(i);
            System.out.println("姓名："+s.getName()+"，年龄："+s.getAge());
        }

    }
}

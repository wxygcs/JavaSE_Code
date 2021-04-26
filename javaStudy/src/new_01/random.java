package new_01;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random r = new Random();

        int a = r.nextInt(1600) + 2 ;
        int b = r.nextInt(1600);
        int c = r.nextInt(1600);

        System.out.println(a+","+b+","+c);
    }
}

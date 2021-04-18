package test_01;

import java.util.Scanner;

/*
    已知用户名和密码，模拟用户登录，总共给三次机会，登录后给出相应提示
 */
public class Login {
    public static void main(String[] args) {
        String username = "xuexi";
        String password = "abc123";
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<4;i++) {
            System.out.println("请输入用户名：");
            String a = sc.nextLine();
            System.out.println("请输入密码：");
            String b = sc.nextLine();
            if(a.equals(username) && b.equals(password)){
                System.out.println("登录成功！");
                break;
            }else {
                System.out.println("用户名或密码错误，还剩"+(3-i)+"次机会");
            }
        }

    }
}

package test_01;
/*
    1-100的数字里，所有包含7，或者是7的倍数的值，都要列出来
 */
public class test_03 {
    public static void main(String[] args) {
        for(int i = 1;i >= 0 & i<= 100;i++){

            //包含个位数是7、十位数是7、7的倍数
            if(i%10 == 7 | i/10%10 == 7 | i%7 == 0){
                System.out.println(i);
            }
        }
    }
}

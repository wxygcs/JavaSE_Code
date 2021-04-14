package test_01;
/*
    数组元素求和
        有一个数组，元素是{68，27，95，88，171，996，51，210}
        求出该数组中满足条件的元素和，条件为：个位和十位都不能是7，且只能是偶数。
 */
public class test_06 {
    public static void main(String[] args) {
        int[] arr = {68,27,95,88,171,996,51,210};
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0 && arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7 ){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}

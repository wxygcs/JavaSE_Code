package test_01;

/*
    设计一个方法，用于比较两个数组的内容是否相同
 */
public class test_07 {
    public static void main(String[] args) {
        int[] arr1 = {5, 99, 8, 5};
        int[] arr2 = {5, 99, 8, 5};
        int[] arr3 = {5, 99, 8, 1};
        int[] arr4 = {5, 99, 8};
        int[] arr5 = {};

        System.out.println(compare(arr1, arr2));
        System.out.println(compare(arr1, arr3));
        System.out.println(compare(arr1, arr4));
        System.out.println(compare(arr1, arr5));
    }

   /* public static boolean compare(int[] arr1,int[] arr2){
        if (arr1.length == arr2.length){
            for (int i = 0 ; i < arr1.length ; i++){
                if (arr1[i] == arr2[i]){
                    continue;
                }else {
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }*/

    public static boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
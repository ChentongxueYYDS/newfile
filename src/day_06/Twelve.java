package day_06;

import java.util.Stack;

//数组元素反转
public class Twelve {
    public static void main(String[] args) {

        //方法一
        //        int[] arr1={1,2,3,4,5};
//        int[] newarr1={5,4,3,2,1};
//        用栈的方法解决，利用栈的先进后出的方法
//        int[] arr1={1,2,3,4,5};
//        Stack<Integer> sta=new Stack<>();
////        for(int s:arr1){
////            sta.push(s);//变量s存贮数组中遍历下来的每个值分别用push方法通过sta这个变量传到栈里面去
////        }
//        while(!sta.isEmpty()){
//            System.out.print(sta.pop()+",");
//        }


        //方法二
        //让首元素和尾元素之间进行交换，其他元素按照这个规则依次进行交换
//        int[] arr1 = {1, 2, 3, 4, 5};
//        System.out.println("原数组是\n");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i]);
//        }
//
//        reverse(arr1, 5);
//    }
//
//    public static void reverse(int arr[], int n) {
//        int j, k, t;
//        for (j = 0; j < n / 2; j++) {
//              t = arr[j];
//              arr[j] =arr[n-j-1];
//              arr[n-j-1] = t;
//        }
//        System.out.println();
//        System.out.println("反转后的数组是\n");
//        for (k = 0; k < n; k++) {
//            System.out.print(arr[k]);
//        }


//方法三
        //使用循环，将原数组的元素反向放置在新数组里面\
//        int[] arr1 = {1, 2, 3, 4, 5};
//        System.out.println("原数组是\n");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i]);
//        }
//        reverse(arr1,5);
//    }
//
//    public static void reverse(int arr1[] ,int h) {
//        int[] a = new int[h];
////        int g=h;
//        for(int i=0;i<arr1.length;i++){
//            a[g-1]=arr1[i];
//            g--;
//        }
//        System.out.println();
//        System.out.println("反转后的数组是\n");
//        for (int k= 0; k < h; k++) {
//            System.out.print(a[k]);
//        }
    }
}


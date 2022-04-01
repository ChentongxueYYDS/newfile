package day_12;
//反转
public class Two {
    public static void main(String[] args) {
        //思路：
        // 1.定义一个数组，使用静态定义
        //2.定义一个参数做为临时空间，定义两个变量start和end定义下角标
        //3.写方法遍历数组
        //4.调用方法
        int[] arr={11,22,33,44,11};
        reverse(arr);
        arr2(arr);
    }
    public static void reverse(int[] arr){
        for(int start=0,end=arr.length-1;start<=end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
    //写方法遍历数组
    //两个明确
    // 1.返回值类型：void
    // 2.参数：int[] arr
    public static void arr2(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }
}

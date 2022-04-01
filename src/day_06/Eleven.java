package day_06;

import java.util.Scanner;

//查找数组中元素出现的索引位置
public class Eleven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入数组中的一个数");
        int n=s.nextInt();
        getindex(n);
    }
    public static void getindex(int n){
        int[] arr1={1,2,4,5,7,8,9};
        for(int i=0;i<arr1.length;i++){
            if(n==arr1[i]){
                System.out.println(n+"在数组中的索引为"+i);
            }
        }
    }
}

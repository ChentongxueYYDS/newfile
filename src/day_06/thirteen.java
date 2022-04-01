package day_06;

import java.util.Scanner;

//评委打分，去除最高分和最低分，然后求剩余的平均值
public class thirteen {
    public static void main(String[] args) {
        int[] arr=new int [5];
        Scanner s=new Scanner(System.in);
        System.out.println("输入评委的分数：");
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int a=getMax(arr);
        int b=getMin(arr);
        int sum=0;
        for (int k=0;k<arr.length;k++){
            sum+=arr[k];
        }
        System.out.println("最大值为"+a);
        System.out.println("最小值为"+b);
        System.out.println("平均值为"+(sum-a-b)/(arr.length-2));
    }
    public static int getMax(int arr[]){
        int max=arr[0];
            for(int j=0;j<arr.length;j++){
                if(max<arr[j]){
                    max=arr[j];
                }
            }
        return  max;
    }
    public static int getMin(int arr[]){
        int min=arr[0];
        for(int j=0;j<arr.length;j++){
            if(min>arr[j]){
                min=arr[j];
            }
        }
        return  min;
    }
}

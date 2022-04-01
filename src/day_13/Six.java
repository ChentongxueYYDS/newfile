package day_13;

import java.util.Scanner;
//求出三个数中的最小数，以及三个数的和
public class Six {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请依次输入三个数");
        int s1=s.nextInt();
        int s2=s.nextInt();
        int s3=s.nextInt();
        int result1=getMin(s1,s2);
        int result2=getMin(result1,s3);
        System.out.println("三个数中最小的数为："+result2);
        System.out.println("三个数的和为："+getSum(s1,s2,s3));
    }
    public static int getMin(int num1,int num2){
        int result=num1<num2?num1:num2;
        return  result;
    }
    public static int getSum(int a,int b,int c){
        int sum1=a+b+c;
        return sum1;
    }
}

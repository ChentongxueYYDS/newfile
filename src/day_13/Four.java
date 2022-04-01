package day_13;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        //比较三个数获取最大的数
        Scanner s=new Scanner(System.in);
        System.out.println("请输入比较的三个数");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int num=compare(a,b);
        int result=compare(num,c);
        System.out.println("三个数中最大的数为："+result);
    }
    //定义一个方法Compare用于比较两个数的大小
    public static int compare(int num1,int num2){
        int result1=num1>num2?num1:num2;
        return result1;
    }
}

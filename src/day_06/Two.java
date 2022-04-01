package day_06;

import java.util.Scanner;

//定义一个求两个数最小值的方法，并用debug模式查看
public class Two {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入a的值");
        int a=s.nextInt();
        System.out.println("请输入b的值");
        int b=s.nextInt();
        System.out.println("较小的值为："+getMin(a,b));
    }
    public static int getMin(int a,int b){
        int c=a<b?a:b;
        return  c;
    }
}

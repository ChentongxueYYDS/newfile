package shixun1;

import java.util.Scanner;

//阶乘
public class jiecheng {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入需要计算的阶乘数");
        long a=s.nextInt();
        long c=1;
        for(int i=1;i<=a;i++){
            c*=i;
        }
        System.out.println(c);
    }
}

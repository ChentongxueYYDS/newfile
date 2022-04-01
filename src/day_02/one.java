package day_02;

import java.util.Scanner;

//三个和尚比身高
public class one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //nextint()和nextline()和next()的区别
        //nextline和next是返回string类型
        //nextint()返回的是int类型
        //不过next和nextint()都是看到回车符就结束，不读取，但是nextline
        //虽然也会结束，但是会读取回车符。
        System.out.println("请输入第一个和尚的身高");
        int i1=sc.nextInt();
        System.out.println("请输入第二个和尚的身高");
        int i2=sc.nextInt();
        int heightMax=(i2>i1)?i1:i2;
        System.out.println("请输入第三个和尚的身高");
        int i3=sc.nextInt();
        int max=heightMax>i3?heightMax:i3;
        System.out.println("最高的和尚的身高是："+max);
    }
}

package day_13;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("请输入一个四位数，分别获取其千位，百位，十位，个位");
        int i=num.nextInt();
       //获取千位数
        int q=i/1000;
        System.out.println("千位："+q);
        //获取百位数
        int b=i/100%10;
        System.out.println("百位："+b);
        //获取十位数
        int s=i/10%10;
        System.out.println("十位："+s);
        //获取个位数
        int g=i%10;
        System.out.println("个位："+g);
    }
}

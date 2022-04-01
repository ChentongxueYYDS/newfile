package day_10;
//判断某一年中的某一个月有多少天
//结题思路 1-需要判断是否是闰年

import java.util.Scanner;

public class Seven1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入年份：");
        int year=s.nextInt();
        System.out.println("请输入月份：");
        int month=s.nextInt();
        System.out.println();
        int days=getday(year,month);
        System.out.println("这个月的天数为："+days);
    }
    public static int getday(int year,int month){
        int[] a={31,28,31,30,31,30,31,31,30,31,30,31};
        int[] b={31,29,31,30,31,30,31,31,30,31,30,31};
        if(year%4==0&&year%100!=0 || year%400==0){
            return b[month-1];
        }else {
            return a[month-1];
        }
    }
}

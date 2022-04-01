package day_10;

import java.util.Scanner;

//某公司每月标准上班时间是160小时，每小时工资是30元。
//如果上班时间超出了160小时，超出部分每小时按1.5倍工资发放。请编写程序计算员工月工资
public class Seven {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("请输入员工上班时间（h）：");
        int hour = num.nextInt();
       int a= getwork(hour);
        System.out.println(a);
    }
    public static int getwork(int hour) {
        int sum = 0;
        if (hour < 160 || hour == 160) {
            sum = 30 * hour;
        } else {
            sum = (hour - 160) * 45 + 160 * 30;
        }
        return sum;
    }
    }
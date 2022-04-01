package shixun;

import day_13.Lianxi_customer;

import java.io.IOException;
import java.util.Scanner;

public class Duofenzhi_Gouwu{
    public static void main(String[] args)  {
        getgouwu();
    }
    public static void getgouwu(){
        System.out.println("*******消费单*******");
        Scanner s = new Scanner(System.in);
        //获取键盘录入个数；
        System.out.println("请输入第一件物品的名称");
        String s1 = s.nextLine();
        System.out.println("请输入第二件物品的名称");
        String s2 = s.nextLine();
        System.out.println("请输入第三件物品的名称");
        String s3 = s.nextLine();
        System.out.println("请输入" + s1 + "的数量以及价格");
        int i1 = s.nextInt();
        int num1 = s.nextInt();
        System.out.println("请输入" + s2 + "的数量以及价格");
        int i2 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println("请输入" + s3 + "的数量以及价格");
        int i3 = s.nextInt();
        int num3 = s.nextInt();
        //创建顾客类对象，将键盘录入的数据传给实例对象
       Duofenzhi_customermassage c=new Duofenzhi_customermassage();
        String huiyuan=c.getVip();
        if (huiyuan.equals("是")) {
            System.out.println("购买物品\t" + "\t单价\t" + "个数\t" + "金额");
            System.out.println(s1 + "\t\t" + "￥" + num1 + "\t" + i1 + "\t￥" + num1 * i1);
            System.out.println(s2 + "\t\t" + "￥" + num2 + "\t" + i2 + "\t￥" + num2 * i2);
            System.out.println(s3 + "\t\t" + "￥" + num3 + "\t" + i3 + "\t￥" + num3 * i3);

            int result = num1 * i1 + num2 * i2 + num3 * i3;
            double money = result * 0.8;
            System.out.println("消费总金额:" + "\t" + result);
            System.out.println("实际消费：\t" + money);
            System.out.println("输入客户给的金额");
            int paymoney = s.nextInt();
            System.out.println("找钱\t" + (paymoney - money) + "元");
            //给出结束语
            System.out.println("消费成功,欢迎下次光临！");
        } else {
            System.out.println("购买物品\t" + "\t单价\t" + "个数\t" + "金额");
            System.out.println(s1 + "\t\t" + "￥" + num1 + "\t" + i1 + "\t\t￥" + num1 * i1);
            System.out.println(s2 + "\t\t" + "￥" + num2 + "\t" + i2 + "\t\t￥" + num2 * i2);
            System.out.println(s3 + "\t\t" + "￥" + num3 + "\t" + i3 + "\t\t￥" + num3 * i3);
            int result = num1 * i1 + num2 * i2 + num3 * i3;
            System.out.println("消费总金额:" + "\t" + result);
            System.out.println("实际消费：\t" + result);
            System.out.println("输入客户给的金额");
            int paymoney = s.nextInt();
            System.out.println("找钱\t" + (paymoney - result) + "元");
            //给出结束语
            System.out.println("消费成功,欢迎下次光临！");
        }
    }
}

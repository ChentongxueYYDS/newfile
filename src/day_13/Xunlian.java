package day_13;

import java.util.Scanner;

public class Xunlian {
    public static void main(String[] args) {
        System.out.println("*******消费单*******");
        Scanner s=new Scanner(System.in);
        //获取键盘录入个数；
        int T=245;
        int Wx=570;
        int Wqp=320;
        System.out.println("请输入第一件物品的价格");
        int i1=s.nextInt();
        System.out.println("请输入第二件物品的价格");
        int i2=s.nextInt();
        System.out.println("请输入第三件物品的价格");
        int i3=s.nextInt();
        int zhekou=s.nextInt();
        System.out.println("购买物品\t"+"\t单价\t" +"个数\t"+"金额");
        System.out.println("T恤\t\t"+"\t￥"+T+"\t" +i1+"\t"+"\t￥"+T*i1);
        System.out.println("网球鞋\t\t"+"￥"+Wx+"\t" +i2+"\t"+"\t￥"+Wx*i2);
        System.out.println("网球拍\t\t"+"￥"+Wqp+"\t"+i3+"\t"+"\t￥"+Wqp*i3);

        System.out.println("折扣:"+"\t"+zhekou+"折");
        int result=T*i1+Wx*i2+Wqp*i3;
        double money=result*0.8;
        System.out.println("消费总金额:"+"\t"+result);
        System.out.println("实际消费:"+"\t"+money);
        System.out.println("找钱"+"\t");
    }
}

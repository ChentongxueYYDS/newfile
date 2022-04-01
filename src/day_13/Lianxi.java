package day_13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lianxi {
    public static void main(String[] args) {
        //第一个案例
        // Scanner s=new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int i=s.nextInt();
//        int j=(i*10+5)/(int)(2+3.14159);
//        System.out.println("加密结果为："+j);

        //第二个案例
        // Scanner s=new Scanner(System.in);
//        System.out.println("请输入java的成绩");
//        int j=s.nextInt();
//        System.out.println("请输入音乐的成绩");
//        int y=s.nextInt();
//        if(j>98 && y>80 || j==100 && y>70){
//            System.out.println("奖励");
//        }else{
//            System.out.println("继续努力");
//        }

        //打出菜单栏
        //创建集合对象用于存储顾客数据
        ArrayList<Lianxi_customer> array = new ArrayList<Lianxi_customer>();
        while (true) {
            System.out.println("\t欢迎使用我行我素管理系统 \t\t");
            System.out.println("*********************************");
            System.out.println("\t\t 1.客户信息管理 \t\t");
            System.out.println("\t\t 2.购物结算 \t\t");
            System.out.println("\t\t 3.真情回馈 \t\t");
            System.out.println("\t\t 4.注销 \t\t");
            System.out.println("*********************************");
            Scanner s = new Scanner(System.in);
            System.out.print("请选择,输入数字：");
            int i = s.nextInt();
            switch (i) {
                case 1:
                    System.out.println("******客户信息管理******");
                    addCustomer(array);
                    break;
                case 2:
                    System.out.print("******购物结算******");
                    compute(array);
                    break;
                case 3:
                    System.out.print("******真情回馈******");
                    choujiang(array);
                    break;
                case 4:
                    System.out.print("******注销******");
                    break;
            }
        }
    }

    //客户信息录入(1)
    public static void addCustomer(ArrayList<Lianxi_customer> customer) {
        //录入顾客的基本信息
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的姓名：");
        String name = scanner.nextLine();
        System.out.print("是否办会员");
        int vip = scanner.nextInt();
        //创建顾客类对象，将键盘录入的数据传给实例对象
        Lianxi_customer c = new Lianxi_customer();
        c.setName(name);
        c.setV(vip);
        //将顾客的数据传到数组中ArrayList
        customer.add(c);
        //给出录入成功提示
        System.out.println("添加顾客成功");
    }

    //购物结算(2)
    public static void compute(ArrayList<Lianxi_customer> customer) {
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
        Lianxi_customer c = new Lianxi_customer();
        int cu = c.getV();
        System.out.println("购买物品\t" + "\t单价\t" + "个数\t" + "金额");
        System.out.println(s1 + "\t\t" + "￥" + num1 + "\t" + i1 + "\t\t￥" + num1 * i1);
        System.out.println(s2 + "\t\t" + "￥" + num2 + "\t" + i2 + "\t\t￥" + num2 * i2);
        System.out.println(s3 + "\t\t" + "￥" + num3 + "\t" + i3 + "\t\t￥" + num3 * i3);
        int result = num1 * i1 + num2 * i2 + num3 * i3;
        double money = result * 0.8;
        System.out.println("消费总金额:" + "\t" + result);
        System.out.println("实际消费：\t" + result);
        System.out.println("是否是会员");
        String usevip = s.nextLine();
        System.out.println("输入客户给的金额");
        int paymoney = s.nextInt();
        if (usevip.equals("是")) {
            System.out.println("找钱\t" + (paymoney - money) + "元");
        } else {
            System.out.println("找钱\t" + (paymoney - result) + "元");
        }//给出结束语
        System.out.println("消费成功,欢迎下次光临！");
    }

    //真情回馈(3)
    public static void choujiang(ArrayList<Lianxi_customer> customer) {
        int[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Random a = new Random();
        for (int j = 10; j > 0; j--) {
            int index = a.nextInt(j);
            int k = arr[index];
            arr[index] = arr[j - 1];
            arr[j - 1] = k;
        }
        int result = 0;
        for (int i = 0; i < 6; i++) {
            result = result * 10 + arr[i];
        }
        System.out.println("你的彩票号码为：" + result);
        if (result == 1234567) {
            System.out.println("买车，资助希望工程，去欧洲旅游");
        } else {
            System.out.println("买下一期体彩，继续烧高香");
        }
    }

    //注销(4)
    public static void zhuxiao(ArrayList<Lianxi_customer> customer) {

    }
}

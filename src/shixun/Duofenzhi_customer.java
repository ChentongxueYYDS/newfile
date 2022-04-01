package shixun;

import java.util.ArrayList;
import java.util.Scanner;

public class Duofenzhi_customer {
    public static void main(String[] args) {
        customer_message();
    }

    public static void customer_message() {
        System.out.println("1.添加客户信息");
        System.out.println("2.显示所有客户信息");
        System.out.println("3.修改客户信息");
        System.out.println("4.查询客户信息");
        //实例化客户信息对象
        ArrayList<Duofenzhi_customermassage> s = new ArrayList<Duofenzhi_customermassage>();
        Duofenzhi_customermassage customer = new Duofenzhi_customermassage();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您录入您的相关信息,需要先注册");
        System.out.print("请输入你的姓名：");
        String name = scanner.nextLine();
        System.out.print("是否办会员");
        String vip = scanner.nextLine();
        System.out.println("输入数字选择您要进行的操作：");
        int i = scanner.nextInt();
            switch (i) {
                case 1:
                    //2.添加客户信息
                    customer.setName(name);
                    customer.setVip(vip);
                    s.add(customer);
                    System.out.println("添加顾客成功！");
                case 2:
                    //1.显示所有客户信息
                    System.out.println("客户\t\t\t" + customer.getName());
                    System.out.println("是否是会员\t" + customer.getVip());
                    //System.out.println(" ");

                    System.out.println("返回到上一级");
                    Duofenzhi_mainmeta meta=new Duofenzhi_mainmeta();
                    meta.mainmeta();
                    case 3:
                    //3.修改客户信息

                    break;
                case 4:
                    //4.查询客户信息

                    break;
            }
        }

}

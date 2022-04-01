package shixun;

import java.util.ArrayList;
import java.util.Scanner;

//主菜单
public class Duofenzhi_mainmeta extends Duofenzhi_customer{
    public static void main(String[] args) {
        mainmeta();
    }
    //主菜单的方法
    public static void mainmeta() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个数字，别乱输入其他的");
            System.out.println("1.客户信息管理");
            System.out.println("2.购物结算");
            System.out.println("3.真情回馈");
            System.out.println("4.注销");
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                switch (i) {
                    case 1:
                        //1.客户信息管理
                        customer_message();
                        break;
                    case 2:
                        //2.购物结算
                        Duofenzhi_Gouwu gouwu=new Duofenzhi_Gouwu();
                        gouwu.getgouwu();
                        break;
                    case 3:
                        //3.真情回馈
                        Duofenzhi_choujiang S=new Duofenzhi_choujiang();
                        S.getchoujiang();
                        break;
                    case 4:
                        //4.注销
                        System.out.println("注销成功！");
                        break;
                }

            } else {
                System.out.println("你也太调皮了，请输入一个数字：");
            }
    }
}
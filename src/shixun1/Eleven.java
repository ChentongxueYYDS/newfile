package shixun1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//客户信息管理
public class Eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("MyShopping管理系统>客户信息管理>添加客户信息");
        while (true) {
            System.out.print("请输入会员号（<4位整数>）：");
            int i = scanner.nextInt();
            System.out.print("请输入会员生日（月/日<用两位整数表示>）");
            String j = scanner.next();
            System.out.print("请输入会员积分");
            int k = scanner.nextInt();
            System.out.println(i + "\t" + j + "\t" + k);
            System.out.println();
        }
      }
   }

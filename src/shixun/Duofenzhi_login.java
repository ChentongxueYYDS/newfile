package shixun;

import java.util.Scanner;
//登录菜单
public class Duofenzhi_login extends Duofenzhi_mainmeta{
    public static void main(String[] args) {
       //方法的调用
        meta();
    }
    //登录菜单的方法
    public static void meta(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数字选择各个功能");
        System.out.println("1.登录系统");
        System.out.println("2.退出");
        int s=scanner.nextInt();
        switch (s){
            case 1:
                System.out.println("*******欢迎你使用我行我素系统*******");
                mainmeta();
                break;
            case 2:
                System.out.println("退出成功！");
                break;
        }
    }
}

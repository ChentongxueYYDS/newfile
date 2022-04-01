package shixun;

import java.util.Scanner;

public class PanDuan3 {
    public static void main(String[] args) {
        //根据会员积分判断打折率
        Scanner s=new Scanner(System.in);
        System.out.println("请输入会员的积分：");
        int x=s.nextInt();
        if(x>=8000){
            System.out.println("打六折");
            System.out.println("打折后的价格为："+x*0.6);
        }
        else if(x>=4000 && x<8000){
            System.out.println("打七折");
            System.out.println("打折后的价格为："+x*0.7);
        }else if(x>=2000 && x<4000){
            System.out.println("打八折");
            System.out.println("打折后的价格为："+x*0.8);
        }else {
            System.out.println("打九折");
            System.out.println("打折后的价格为："+x*0.9);
        }
    }
}

package shixun;

import java.util.Scanner;

public class Xunhuan2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       //do-while
//        do{
//            System.out.println("上机编写程序");
//            System.out.println("合格了吗？（y/n）");
//            a=input.next();
//            System.out.println("");
//        }while(!"y".equals(a));
//        System.out.println("恭喜你通过了测试");

        //while循环
//        String a=input.next();
////        System.out.println("上机编写程序");
////        System.out.println("合格了吗？（y/n）");
////        while(a.equals("y")){
////            System.out.println("恭喜你通过了测试");
////        }

       //for循环
        System.out.println("合格了吗？（y/n）");
        String a=input.next();
        for(;!"y".equals(a);){
            System.out.println("上机编写程序！");
            System.out.println("合格了吗？（y/n）");
            a=input.next();
            System.out.println("");
        }
        System.out.println("恭喜你通过了测试");
    }
}

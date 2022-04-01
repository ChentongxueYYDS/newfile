package shixun;

import java.util.Scanner;
//随机数的生成样式，定义最小值到最小值的区间
//Random r=new Random(MAX-Min+1)+Min;
//猜数字
public class Xunlian10 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;
//while循环
        //        while (true) {
//            Scanner s = new Scanner(System.in);
//            System.out.println("请输入你猜的数：");
//            int cai = s.nextInt();
//            if (cai < num) {
//                System.out.println("你猜的数小了");
//            } else if (cai > num) {
//                System.out.println("你猜的数大了");
//            } else {
//                System.out.println("恭喜你猜对了");
//                break;
//            }
//        }

        //do-while循环
//        do {
//            Scanner s=new Scanner(System.in);
//            System.out.println("请输入你要猜的数");
//            int cai=s.nextInt();
//        if (cai < num) {
//            System.out.println("你猜的数小了");
//        } else if (cai > num) {
//            System.out.println("你猜的数大了");
//        } else {
//            System.out.println("恭喜你猜对了");
//            break;
//        }
//    }while (true);

        //for循环
        for(;;){
            Scanner s=new Scanner(System.in);
            System.out.println("请输入你要猜的数");
            int cai=s.nextInt();
        if (cai < num) {
            System.out.println("你猜的数小了");
        } else if (cai > num) {
            System.out.println("你猜的数大了");
        } else {
            System.out.println("恭喜你猜对了");
            break;
        }
    }
        }
    }
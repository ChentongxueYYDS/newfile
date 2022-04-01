package shixun1;

import java.util.Scanner;

//输出星期数
public class One {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("请输入一个1~7之间的数，学习计划");
            int i = s.nextInt();
            switch (i) {
                case 1:
                    System.out.println("上午：手敲代码200行；下午：跑步");
                    break;
                case 2:
                    System.out.println("上午：手敲代码200行；下午：跑步");
                    break;
                case 3:
                    System.out.println("上午：手敲代码200行；下午：跑步");
                    break;
                case 4:
                    System.out.println("上午：手敲代码200行；下午：跑步");
                    break;
                case 5:
                    System.out.println("上午：手敲代码200行；下午：跑步");
                    break;
                case 6:
                    System.out.println("上午：手敲代码200行；下午：跑步");
                    break;
                case 7:
                    System.out.println("上午：手敲代码200行；下午：跑步");
                    break;
                default:
                    System.out.println("你输入的数字不在范围内，请重新输入");
                    break;
            }
        }
    }
}
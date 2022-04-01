package shixun;

import java.util.Scanner;

public class Panduan {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("请输入要判断的数:");
            int scode = s.nextInt();
            if (scode >= 0 && scode <= 100) {
                if (scode >= 80) {
                    System.out.println("良好");
                } else if (scode >= 60) {
                    System.out.println("中等");
                } else {
                    System.out.println("差");
                }
            }
            else {
                System.out.println("你的输入有误");
            }
        }
    }
}

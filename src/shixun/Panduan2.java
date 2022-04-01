package shixun;

import java.util.Scanner;

public class Panduan2 {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("请输入你的金额");
            int i = s.nextInt();
            if (i >= 0 && i <= 5000000) {
                if (i >= 5000000) {
                    System.out.println("买凯迪拉克");
                } else if (i >= 1000000) {
                    System.out.println("帕桑迪");
                } else if (i >= 500000) {
                    System.out.println("伊兰特");
                } else if (i >= 100000) {
                    System.out.println("奥拓");
                } else {
                    System.out.println("捷安特");
                }
            }
        }
    }
}

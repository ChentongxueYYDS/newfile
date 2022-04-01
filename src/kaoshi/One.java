package kaoshi;

import java.util.Scanner;
//判断成绩的等级
public class One {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的成绩判断等级");
            int i = s.nextInt();
            if(i>=0 && i<=100) {
                switch (i / 10) {
                    case 9:
                        System.out.println("优秀！");
                        break;
                    case 8:
                        System.out.println("良好！");
                        break;
                    case 7:
                        System.out.println("中等！");
                        break;
                    case 6:
                        System.out.println("平时多努力！");
                        break;
                    default:
                        System.out.println("不及格！");
                        break;
                }
            }
            else {
                System.out.println("你的输入成绩不在范围内，请重新输入");
            }
        }
    }
}
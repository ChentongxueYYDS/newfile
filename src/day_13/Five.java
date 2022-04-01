package day_13;

import java.util.Scanner;

//判断成绩是否合格
public class Five {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生的成绩");
        int num = s.nextInt();
        code(num);
    }
    public static void code(int i) {
            if (i >= 60) {
                System.out.println("合格");
            } else {
                System.out.println("不合格");
            }
    }
}
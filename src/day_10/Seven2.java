package day_10;

import java.util.Scanner;

// 根据学生成绩，打印学生考试等级
//[90,100]    优
//[80,90)     良
//[60,80)     中
//[0,60)      差
public class Seven2 {
    public static void main(String[] args) {
        while(true){
            Scanner s = new Scanner(System.in);
            System.out.println("请输入学生的成绩(0~100分)：");
            int grade = s.nextInt();
            System.out.print("等级为：");
            getgrade(grade);
        }
    }
    public static void getgrade(int a){
        switch (a/10){
            case 10:
            case 9:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
            case 7:
            case 6:
                System.out.println("中");
                break;
            default:
                System.out.println("差");
                break;
        }
    }
}

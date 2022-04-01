package shixun;

import java.util.Scanner;

public class Xunlian6 {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("请输入学生的成绩，进行等级的判断");
            int i = s.nextInt();
            //方法一：switch进行判断
            if(i>=0 && i<=100){
            switch (i/10) {
                case 9:
                    System.out.println("perfect");
                    break;
                case 8:
                    System.out.println("great");
                    break;
                case 7:
                    System.out.println("good");
                    break;
                case 6:
                    System.out.println("so-so!");
                    break;
                default:
                    System.out.println("不及格");
                    break;
            }
            }
            else{
                System.out.println("你的分数不在判断范围内，请重新输入");
            }
            }

            //方法二：if-else-if-else
//            if(i>=0 && i<=100) {
//                if (i >= 90 && i < 100) {
//                    System.out.println("prefect");
//                } else if (i >= 80 && i < 90) {
//                    System.out.println("great");
//                } else if (i >= 70 && i < 80) {
//                    System.out.println("good");
//                } else if (i >= 60 && i < 70) {
//                    System.out.println("so-so");
//                } else {
//                    System.out.println("不及格");
//                }
//            }
//            else {
//                System.out.println("你的分数不在判断范围内，请重新输入");
//            }
        }
    }


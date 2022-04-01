package shixun1;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入班级人数");
        int y = s.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= y; i++) {
            System.out.print("请输入第" + i + "个学生的年龄");
            int num = s.nextInt();
            if (num > 0 && num <= 100) {
                if (num >= 30) {
                    sum1++;
                } else {
                    sum2++;
                }
            } else {
                System.out.println("你输入的岁数不在查询范围内，请重新输入");
            }
        }
        System.out.println("大于80分学生的比例为：" + sum1 * 10 + "%");
        System.out.println("小于80分学生的比例为：" + sum2 * 10 + "%");

    }
}
        //while循环
//        int sum1 = 0;
//        int sum2 = 0;
//        int i = 1;
//        while (i <= 10){
//            System.out.print("请输入第" + i + "个顾客的年龄");
//            int num = s.nextInt();
//            i++;
//            if (num > 0 && num <= 100) {
//                if (num >= 30) {
//                    sum1++;
//                } else {
//                    sum2++;
//                }
//            }
//            else {
//                System.out.println("你输入的岁数不在查询范围内，请重新输入");
//            }
//        }
//        System.out.println("大于30岁的人比例为：" + sum1 * 10 + "%");
//        System.out.println("小于30岁的人比例为：" + sum2 * 10 + "%");
//    }
//}
//        System.out.println("大于30岁的人比例为："+(double) sum1/num1);
//        System.out.println("小于30岁的人比例为："+(double) sum2/num1);



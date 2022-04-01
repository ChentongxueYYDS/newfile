package day_13;

import java.util.Scanner;

public class Eight {
    //输出对应的季节
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个月份进行季节的判断");
        int s1=s.nextInt();
        switch (s1){
            case 12:
            case 1:
            case 2:
                System.out.println("春季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("夏季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("秋季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("冬季");
                break;
        }
    }
}

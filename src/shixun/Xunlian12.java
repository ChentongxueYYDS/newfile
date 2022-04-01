package shixun;

import java.util.Scanner;

public class Xunlian12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入三个数比较大小:输出最小的数");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();
        if(num1!=num2 && num2!=num3) {
            int num4 = num1 > num2 ? num2 : num1;
            int num = num4 > num3 ? num3 : num4;
            System.out.println("三个数中最小的数为" + num);
        }
    }
}

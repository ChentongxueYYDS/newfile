package shixun1;

import java.util.Scanner;

//打印图形
public class Thireen {
    public static void main(String[] args) {
        //1.打印直角三角形
       /* f3or(int i=0;i<=9;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //2.打印倒直角三角形
       /* for(int i=0;i<=9;i++){
            for(int j=9;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //3.打印等腰三角形
        for (int i = 0; i <= 9; i++) {
            for (int j =9; j >=i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i*2;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //4.打印矩形
       /* Scanner s = new Scanner(System.in);
        System.out.println("请输入行数");
        int a = s.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
}
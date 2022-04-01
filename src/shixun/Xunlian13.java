package shixun;

import java.util.Scanner;

//换位输出
public class Xunlian13 {
    public static void main(String[] args) {
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("请分别输入两个数");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c;
       if(a==b){
           System.out.println("a:"+a+"b:"+b);
       }else {
           c = a;
           a = b;
           b = c;
           System.out.println(a);
           System.out.println(b);
       }*/

        //循环输出150到300之间的奇数
        int count = 0;
        for (int i = 150; i <= 300; i++) {
            if (i % 2 != 0) {
                System.out.print(i+"\t");
                count++;
            }
            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}
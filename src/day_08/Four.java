package day_08;

import java.util.Scanner;

//字符串的拼接
public class Four {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请分别输入四个字母，每行输入一个字母");
        String a=s.nextLine();
        String b=s.nextLine();
        String c=s.nextLine();
        String d=s.nextLine();
        String [] arr={a,b,c,d};
        spell(arr);
    }
    public static void spell(String [] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}

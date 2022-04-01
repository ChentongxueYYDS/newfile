package day_02;

import java.util.Scanner;

//奇数和偶数的判断
public class Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println(a+"是偶数");
        }else {
            System.out.println(a+"是奇数");
        }
    }
}

package day_02;

import java.util.Scanner;

//if语句练习，分别输入1-7判断星期数
public class Four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个1-7之间的数");
        int b=sc.nextInt();
        //if方法太麻烦了
//        if(b==1){
//            System.out.println("星期一");
//        }else if(b==2){
//            System.out.println("星期二");
//        }
//        else if(b==3){
//            System.out.println("星期三");
//        }
//        else if(b==4){
//            System.out.println("星期四");
//        }
//        else if(b==5){
//            System.out.println("星期五");
//        }else if(b==6){
//            System.out.println("星期六");
//        }else {
//            System.out.println("星期日");
//        }
    //switch方法
        switch (b){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            default:
                System.out.println("星期日");
                break;
        }
    }
}

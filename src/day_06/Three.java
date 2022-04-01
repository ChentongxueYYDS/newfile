package day_06;

import java.util.Scanner;

//减肥计划，根据输入的星期数进行判定
public class Three {
    public static void main(String[] args) {
        //方法一：用if-else if-else实现
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个1-7之前的星期数");
        int a=s.nextInt();
        if(a==1){
            System.out.println("跑步");
        }else if(a==2){
            System.out.println("游泳");
        }
        else if(a==3){
            System.out.println("游泳");
        }
        else if(a==4){
            System.out.println("游泳");
        }
        else if(a==5){
            System.out.println("游泳");
        }
        else if(a==6){
            System.out.println("游泳");
        }
        else {
            System.out.println("游泳");
        }
        //方法二：用Switch实现
        switch(a){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("跑步");
                break;
            case 3:
                System.out.println("跑步");
                break;
            case 4:
                System.out.println("跑步");
                break;
            case 5:
                System.out.println("跑步");
                break;
            default:
                System.out.println("跑步");
                break;
        }
    }
}

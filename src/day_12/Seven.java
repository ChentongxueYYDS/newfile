package day_12;

import java.util.Scanner;

//字符串的反转
public class Seven {
    public static void main(String[] args) {
        //思路：
        //1.用Scanner方法；
        //2.定义一个String变量用于获取输入的值
        //3.定义一个方法用于反转；
        //4.for循环反向遍历；
        //5.调用方法
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String a=s.nextLine();
        String s2=reverse(a);
        System.out.println("反转的结果为："+s2);
    }
    //返回值类型：String,参数：String s;
    public static String reverse(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
                s1+=s.charAt(i);
        }
        return s1;
    }
}

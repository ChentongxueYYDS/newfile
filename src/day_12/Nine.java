package day_12;

import java.util.Scanner;

//StringBuilder中的字符串反转
public class Nine {
    public static void main(String[] args) {
        //思路：
        // 1.获取输入的字符串，用Scanner;
        // 2.用一个变量接受输入的字符串；
        // 3.定义一个方法用于实现字符串的反转；
        // 4.将StringBuilder转换成String;
        // 5.用String变量输出结果；
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = s.nextLine();
        String reverse = getReverse(line);
        System.out.println("r:"+reverse);

    }
    //两个明确：
    // 1.返回值类型：String,
    // 2.参数：String s
    public  static String getReverse(String s){
//        StringBuilder s1=new StringBuilder(s);
//        s1.reverse();
//        String s2=s1.toString();
//        return s2;
       return new StringBuilder(s).reverse().toString();
    }
}

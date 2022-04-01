package day_08;

import java.util.Scanner;

//统计字符串各种字符次数
public class Three {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String result=s.nextLine();
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=1;i<result.length();i++){
            if(result.charAt(i)<'Z' && result.charAt(i)>'A'){
               count1++;
            }
            if(result.charAt(i)<'z' && result.charAt(i)>'a'){
               count2++;
            }
            if(result.charAt(i)<'9' && result.charAt(i)>'0'){
               count3++;
            }
        }
        System.out.println(result+"中大写字母有"+count1+"个");
        System.out.println(result+"中小写字母有"+count2+"个");
        System.out.println(result+"中数字字符有"+count3+"个");
    }
}

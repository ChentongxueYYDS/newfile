package day_12;

import java.util.Scanner;

//统计字符次数
public class Five {
    public static void main(String[] args) {
        //思路：
        //1.使用Scanner语句
        //2.初始化三个变量（bigcount,smallcount,numbercount）
        //3.新建一个char变量用于获取输入的每一个值(charAt())
        //4.使用分支语句进行判断（大写字母，小写字母以及数字）底层实现：ASCII码
        Scanner s1=new Scanner(System.in);
        System.out.println("请输入一串带大写字母和小写字母以及数字的字符串");
        String line=s1.nextLine();
        int bigcount=0;
        int smallcount=0;
        int numbercount=0;
        //遍历整个字符串获取每一个字符
        for(int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            if(ch>='a'&&ch<='z'){
                smallcount++;
            }else if(ch>='A'&&ch<='Z'){
                bigcount++;
            }
            else if(ch>='0'&&ch<='9'){
                numbercount++;
            }
        }
        System.out.println("大写字母有："+bigcount+"个");
        System.out.println("小写字母有："+smallcount+"个");
        System.out.println("数字有："+numbercount+"个");
    }
}

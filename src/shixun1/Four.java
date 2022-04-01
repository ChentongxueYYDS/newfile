package shixun1;

import java.util.Scanner;

//获取平均分
public class Four {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name=s.nextLine();
        System.out.print("请输入需要计算的门数：");
        int num=s.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
           System.out.print("请输入第"+i+"门课的成绩");
           int num1=s.nextInt();
           sum+=num1;
       }
        System.out.println(name+"的平均分为"+sum/num);
    }
}

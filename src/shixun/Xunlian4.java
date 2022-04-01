package shixun;

import java.util.Scanner;

public class Xunlian4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入三个数进行排序");
        System.out.println("请输入第一个数");
        int i1=scanner.nextInt();
        System.out.println("请输入第二个数");
        int i2=scanner.nextInt();
        System.out.println("请输入第三个数");
        int i3=scanner.nextInt();
         int max=getMax(i1,i2,i3);
        System.out.println("三个数中比较大的数为："+max);
        int min=getMin(i1,i2,i3);
        System.out.println("三个数中比较小的数为:"+min);
    }
    //获取最大值
    public static int getMax(int a,int b,int c) {
       int max1=a>b?a:b;
       int max=max1>c?max1:c;
        return max;
    }
    public static int  getMin(int a,int b,int c){
    //获取最小值
        int min1=a<b?a:b;
        int min=min1<c?min1:c;
        return min;
    }
}

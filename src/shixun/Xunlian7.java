package shixun;

import java.util.Scanner;

//就是那圆的面积与周长
public class Xunlian7 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        //获取圆的半径r
        int i=r.nextInt();
        //定义π为3.14
        final double p=3.14;
        //定义圆的面积m和周长z的求解方式
        double m=i*i*p;
        double z=2*p*i;
        //输出圆的周长和面积
        System.out.println(m);
        System.out.println(z);
    }
}

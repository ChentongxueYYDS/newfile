package day_10;
import java.util.Scanner;
//计算数字n阶乘
//0和1的阶乘都为1
public class Seven3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入要计算哪个数的阶乘");
        int num = s.nextInt();
        int a=factorial(num);
        System.out.println(num+"的阶乘为"+a);
    }
    public static int factorial(int n){
        int p;
        if(n==0||n==1){
            p=1;
        }else {
            p=factorial(n-1)*n;
        }
        return p;
    }
}

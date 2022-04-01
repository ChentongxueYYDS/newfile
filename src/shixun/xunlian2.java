package shixun;

import java.util.Scanner;

//三个实例
public class xunlian2 {
    public static void main(String[] args) {
        //第一个实例
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个1~5之间的数");
        int i=scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("北北");
                break;
            case 2:
                System.out.println("今今");
                break;
            case 3:
                System.out.println("欢欢");
                break;
            case 4:
                System.out.println("迎迎");
                break;
            case 5:
                System.out.println("你你");
                break;
            default:
                System.out.println("北京欢迎你");
                break;
        }
    }
}

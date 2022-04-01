package shixun;
import java.util.Scanner;
//猜拳的小游戏
//定义石头为1，剪刀为2，布为3
//假设机器随机生成的是石头，你猜的布，则你赢；else机器赢
//假设机器随机生成的是剪刀，你猜的石头，则你赢；else机器赢
//假设机器随机生成的是布，你猜的剪刀，则你赢；else机器赢
public class Xunlian11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要出的手势1:石头，2：剪刀，3：布：");
            //num1为人输入的手势
            int num1 = s.nextInt();
            //num2为机器输入的手势
            int num2 = (int) (Math.random() * 3) + 1;
            System.out.println("机器出的是"+num2);
            if(num2>=1 && num2<=3) {
                if (num1 == num2) {
                    System.out.println("平了，再猜");
                } else if (num1 == 1 && num2 == 2) {
                    System.out.println("你赢了");
                } else if (num1 == 3 && num2 == 1) {
                    System.out.println("你赢了");
                } else if (num1 == 2 && num2 == 3) {
                    System.out.println("你赢了");
                } else {
                    System.out.println("机器赢了");
                }
            }
            else {
                System.out.println("请重新输入");
            }
        }
    }
}
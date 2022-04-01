package shixun;

import java.util.Random;

//随机数跳出循环
public class Xunlian9 {
    public static void main(String[] args) {
        int count=0;
        while(true){
        int num=(int)(Math.random()*100)+1;
            if(num==66){
                System.out.println("程序终止");
                System.out.println("一共随机了"+count+"次");
                break;
            }
            else{
                System.out.println("程序随机的数为"+num+"继续执行");
                count++;
            }
        }
    }
}

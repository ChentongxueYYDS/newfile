package heima;

import java.util.Scanner;

//解决不死神兔问题
//題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
//对兔子，假如兔子都不死，问每个月的兔子总数为多少？
//思路：第一个和第二个月时兔子的对数都是1对，从第三个月之后才开始慢慢地递增
//1,1,2,3,5,8
//细心的小伙伴已经发现了从第三个月开始，每个月的兔子对数都等于前面两个月的兔子之和
public class heima_001 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入第多少个月");
        int month1=s.nextInt();
        int month=month1+1;
        //定义一个数组用于存放兔子
        int[] arr=new int[month];
        //定义第一个月和第二月的兔子对数
        arr[0]=arr[1]=1;
        System.out.println("第1个月的兔子的对数为"+1+"对"+","+"总数为"+1*2+"个");
        for(int i=2;i<arr.length;i++){
//            从第三个月开始，每个月的兔子对数都等于前面两个月的兔子之和
            arr[i]=arr[i-1]+arr[i-2];
            System.out.println("第"+i+"个月的兔子的对数为"+arr[i-1]+"对"+","+"总数为"+arr[i-1]*2+"个");
        }

    }
}

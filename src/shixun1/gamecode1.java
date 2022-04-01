package shixun1;

import java.util.Scanner;

//统计打折数量
public class gamecode1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入要购买物品的个数");
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            int count=0;
            System.out.print("请输入第"+(i+1)+"个人三件物品的价格");
            for(int j=0;j<3;j++){
                double k=s.nextInt();
                if(k>=300){
                    count++;
                }
            }
            System.out.println("第"+(i+1)+"个人共有"+count+"件物品享受8折优惠");
        }
    }
}

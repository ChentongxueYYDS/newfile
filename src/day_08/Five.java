package day_08;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

//将字符串的内容进行反转
public class Five {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请分别输入四个字母，每行输入一个字母");
        String s1=s.nextLine();
        String s2=s.nextLine();
        String s3=s.nextLine();
        String s4=s.nextLine();
        String arr[]={s1,s2,s3,s4};
        //string数组转换成int数组      这里有问题
        int[] array = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
        reverse(array,4);

    }
    public static void reverse(int a[],int n){
        //用栈的方法
//       Stack<String> sta=new Stack<>();
//       for (String s:a){
//           sta.push(s);
//       }
//       while(!sta.isEmpty()){
//           System.out.println(sta.pop());
//       }
        //首元素和尾元素交换
        int j,k,t;
        for(j=0;j<n/2;j++){
            t=a[j];
            a[j]=a[n-1-j];
            a[n-1-j]=t;
        }
        System.out.println("交换完的数\n");
        for (k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
     }

}

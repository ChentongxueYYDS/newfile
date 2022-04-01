package shixun1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//循环录入学生成绩，进行降序排序后输出
public class twelve {
    public static void main(String[] args) {
        //1.循环录入学生成绩，进行降序排序后输出
        /*Scanner s=new Scanner(System.in);
        System.out.print("请输入需要排序的五个数：\t");
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }*/

        //2.随机生成五个成绩然后进行升序输出,并且求和和平均数
        int sum=0;
        double average=0;
        int arr1[]=new int[5];
        for(int i=0;i<arr1.length;i++){
            int code=(int)(Math.random()*100)+1;
            arr1[i]=code;
        }
        Arrays.sort(arr1);
        System.out.println("从小到大的输出为：");
       for(int i=0;i<arr1.length;i++){
           sum+=arr1[i];
           System.out.println("随机的成绩第"+(i+1)+"门为："+arr1[i]);

       }
        //3.获取最大值和最小值
        //定义数组arr1[0]中最大值第一个为arr1[0]；
        //定义数组中arr2[1]中最小值第一个为arr1[1];
        int min=arr1[0];
        int max=arr1[1];
        for(int j=0;j<arr1.length;j++){
            if(max>arr1[j]){
                max=arr1[j];
            }
            if(min<arr1[j]){
                min=arr1[j];
            }
        }
        System.out.print("最大值为："+max+"\t");
        System.out.print("最小值为："+min+"\t");
        System.out.println();
        System.out.println("随机的和为："+sum);
        System.out.println("平均数为："+sum/5);
        }
    }


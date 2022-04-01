package day_12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class One
{
   //题目：比较两个数组的内容是否相同
   //思路：
    //1.定义两个数组，用静态方法定义；
    //定义方法
    //2.比较两个数组的长度是否相同
    //3.使用循环遍历两个数组获取数组的值；
    //4.使用分支语句进行比较；
    //5.返回比较的结果
   public static void main(String[] args) {
       int[] arr1={1,3,5,7,9};
       int[] arr2={1,3,7,5,9};
       //方法的调用
       boolean c=compare(arr1,arr2);
       System.out.println("比较的结果："+c);
}
      //两个注意
    //返回值类型，参数
       public static  boolean compare(int[] arr1, int[] arr2){
            if(arr1.length!=arr2.length){
                return false;
            }
            for(int i=0;i<arr1.length;i++){
                if(Arrays.equals(arr1,arr2)){
                    return  true;
                }
            }
            return false;
       }
}
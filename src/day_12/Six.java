package day_12;
//将数组中的数字符串拼接
public class Six {
    public static void main(String[] args) {
        //思路
        //1.定义一个静态数组；
        // 2.定义一个方法；
        // 3.使用循环获取数组中的值；
        // 4.将数组中的值变成字符串类型的,返回值；
        //5.方法调用；
        int[] arr={1,2,3};
        //方法的调用
        //定义一个String变量进行接收
        String a=way(arr);
        System.out.println("拼接后的字符串为："+a);
    }
   //两个明确
    //1.返回值类型：String,2.参数：s;
    public static String way(int[] arr){
       String s="";
       s+="[";
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                s+=arr[i];
            }else{
                s+=arr[i];
                s+=",";
            }
        }
       s+="]";
        return s ;
    }
}

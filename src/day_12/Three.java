package day_12;
//评委打分问题
public class Three {
    public static void main(String[] args) {
        //思路：
        //1.定义一个数组静态定义；
        // 2.分别定义求最大值和最小值的方法，以及求平均值的方法；
        // 3.循环遍历数组中的元素；
        // 4.方法调用
        int [] arr1={11,22,33,44,55};
        //输出最大最小值
        int max=getMax(arr1);
        System.out.println("最大值为："+max);
        int min=getMin(arr1);
        System.out.println("最小值为："+min);
        //求和
        int sum=sum(arr1);
        //输出平均值
        //average=sum-max-min/arr.length-2
        //除号两边
        int average=(sum-max-min)/(arr1.length-2);
        System.out.println("平均值为："+average);

    }
    public  static int getMax(int[] arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
                if(max<arr[i]){
                max=arr[i];
            }
        }
       return max;
    }
    public  static int getMin(int[] arr){
        int min=arr[0];
        for (int j=0;j<arr.length;j++){
            if(min>arr[j]){
                min=arr[j];
            }
        }
        return min;
    }
    public static  int sum(int[] arr){
        int sum=0;
        for(int k=0;k<arr.length;k++){
            sum+=arr[k];
        }
        return sum;
    }
}

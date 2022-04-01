package day_12;
//stringBuidler中的字符串的拼接；
public class Eight {
    public static void main(String[] args) {
        //思路：1.静态初始化一个数组；
        // 2.定义一个方法，用于字符串的拼接；
        // 3.使用StringBuilder方法；
        // 4.将StringBuilder转换成String输出；
        // 5.输出结果；
        int[] arr={1,2,3};
        String s = arraytoString(arr);
        System.out.println(s);
    }
    //定义一个方法：
    //两个明确：返回值类型:String,参数：int[] arr
    public static  String arraytoString(int[] arr){
        StringBuilder s=new StringBuilder();
        s.append("[");
            for(int i=0;i<arr.length;i++){
                if(i==arr.length-1){
                    s.append(arr[i]);
                }else {
                    s.append(arr[i]).append("," );
                }
            }
        s.append("]");
            //将StringBuilder转换成String
        String s1=s.toString();
        return s1;
    }
}

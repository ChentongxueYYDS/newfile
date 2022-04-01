package day_04;
//空指针异常问题
//解决方法：给数组一个真正的堆内存引用即可
public class one {
    public static void main(String[] args) {
        int[] arr=new int[30];
        System.out.println(arr[1]);
    }
}

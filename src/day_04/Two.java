package day_04;
//索引越界异常
//解决方法：将错误索引放在正确的索引范围即可
public class Two {
    public static void main(String[] args) {
        int [] arr={11,22,33};
//        System.out.println(arr[3]);
////        java.lang.ArrayIndexOutOfBoundsException
        System.out.println(arr[2]);
    }
}

package day_06;
//为什么两个整数相除会得到0；因为a是比b小，除不到就为0；
//解决方法：将整数改为小数，或者是将整型改为浮点型
public class Eight {
    public static void main(String[] args) {
        int a=6;
        int b=5;
        int c=a/b;
        System.out.println(c);
    }
}

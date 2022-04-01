package day_01;

public class Three {
    public static void main(String[] args) {
        //byte 范围-128~127
        byte a=126;
        System.out.println(a);
        //short 范围-2^15-2^15-1
        short b=12345;
        System.out.println(b);
        //int 范围-2^31-2^31-1 大约41亿
        int c=15235423;
        System.out.println(c);
        //long 范围-2^63-2^63-1
        long d=454543L;
        //float 范围
        float e=1.0F;
        System.out.println(e);
        //double 范围
        double f=1.08;
        System.out.println(f);
        //bollean 范围true，false
        boolean title=true;
        //char 范围0~65535
        char g='n';//字母，数字和汉字都占两个字节
        System.out.println(g);
    }
}

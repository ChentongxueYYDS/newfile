package day_08;
//String类的构造方法
public class Constitute {
    public static void main(String[] args) {
       //创建一个空的字符串对象
        String s=new String();
        System.out.println(s);
        //根据字符数组创建字符串对象
        char[] a={'A','B','C','D'};
        System.out.println(a);
        //根据字节数组创建字符串对象
        byte[] b={97,98,99,100,101};
        String g=new String(b);
        System.out.println(g);
        //String 变量名 = “字符串内容”;
        String c="helloworld";
        System.out.println(c);
        //String 变量名=new String(String original);
        String d=new String("hello");
        System.out.println(d);
        //使用String字节数组的一部分
        byte[] h={97,98,99,100,101};
        String e=new String(h,1,2);
        System.out.println(e);
    }
}

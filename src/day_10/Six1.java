package day_10;
//多线程卖票的测试类
public class Six1 {
    public static void main(String[] args) {
        Six a=new Six();
        Thread t1=new Thread(a,"窗口1：");
        Thread t2=new Thread(a,"窗口2：");
        Thread t3=new Thread(a,"窗口3：");
        Thread t4=new Thread(a,"窗口4：");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

package day_13;

public class Two_Demo {
    public static void main(String[] args) {
        Two s=new Two();
        Thread t1=new Thread(s,"窗口1");
        Thread t2=new Thread(s,"窗口2");
        Thread t3=new Thread(s,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

package day_13;

public class BoxDemo {
    public static void main(String[] args) {
        Box b=new Box();

        Producter p=new Producter(b);

        Customer c=new Customer(b);

        Thread t1=new Thread(p);
        Thread t2=new Thread(c);

        t1.start();
        t2.start();
    }
}

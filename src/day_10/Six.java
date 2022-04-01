package day_10;
//多线程卖票问题
public class Six implements Runnable{
    public int ticket=100;
    @Override
    public void run() {
        while(true){
            sellTicket();
        }
    }

    private synchronized void sellTicket() {
        try {
            Thread.sleep(50);//指定时间内暂停当前线程的执行，以毫秒为单位的参数值不能为负，
            //否则会抛出
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(ticket>0){
            //Thread.currentThread().getName()意思是线程如果不显示指定名字的话，系统会给它
            //分配一个名字，如果显示给它一个名字，则getName()就是返回它的名字
            System.out.println(Thread.currentThread().getName()+"正在卖出第"+ticket+"张票");
            ticket--;
        }
    }
}

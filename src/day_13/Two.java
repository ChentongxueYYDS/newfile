package day_13;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//743878437
public class Two implements Runnable {
    private static int ticket = 100;
    private Lock lock=new ReentrantLock();
//    private Object obj = new Object();
//    private int x = 0;

    @Override
    public void run() {
        while (true) {
//            if (x % 2 == 0) {
            //反射
//                synchronized (Two.class) {
//                    if (ticket > 0) {
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                            //在命令行打印异常信息在程序中出错的位置及原因
//                        }
//                        System.out.println(Thread.currentThread().getName() + "正在出售序号为" + ticket + "的票");
//                        ticket--;
////                    }
//                }
//            }
//                    else {
//                        sellTicket();
//            }
//                        x++;
//                }
//            }
//            private static synchronized void sellTicket(){
            try {
                //放置一个锁
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        //在命令行打印异常信息在程序中出错的位置及原因
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售序号为" + ticket + "的票");
                    ticket--;
                }
            }
            finally {
                //开锁
                lock.unlock();
            }
        }
    }
}
//            }


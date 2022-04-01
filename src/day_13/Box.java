package day_13;

public class Box {
    //定义一个变量用于表示第n瓶奶
    private int milk;
    //定义一个成员变量用于表示奶箱的状态
    private boolean state=false;
    //定义了两个方法用于存储牛奶和获取牛奶
    public synchronized void put(int milk){
        if(state){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.milk=milk;
        System.out.println("送奶工放入第"+this.milk+"瓶奶放入奶箱");
        state=true;
        //唤醒其他线程
        notifyAll();
    }
    public synchronized void get(){
        if(!state){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有牛奶就消费牛奶
        System.out.println("用户从奶箱拿出第"+this.milk+"瓶奶");
        //消费完后更改奶箱状态
        state=false;
        //唤醒其他线程
        notifyAll();
    }

}

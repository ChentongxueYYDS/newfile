package day_07;
//类的定义与方法的调用
public class Phone {
    public static void main(String[] args) {
        String brand="阿迪达斯";
        int price=500;
        call();
        transmit();
    }
    public static void call(){
        System.out.println("打电话");
    }
    public static void transmit(){
        System.out.println("发送信息");
    }
}

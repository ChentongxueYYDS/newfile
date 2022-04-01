package day_07;
//手机测试类
public class PhoneDemo {
    public static void main(String[] args) {
        Phone1 a=new Phone1();
       a.call();
       a.transmit();
//       a.setname="小米";
//       a.setage=20;
        Phone1 s=new Phone1();
        s.setName("小米");
        s.setAge(2);
        System.out.println(s.getName()+","+s.getAge());
    }
}

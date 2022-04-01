package day_13;

import java.net.InetAddress;
import java.net.UnknownHostException;
//InetAddress中的getByName方法，有getHoseName和getHostAddress方法分别获取主机的IP地址和主机名
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address= InetAddress.getByName("169.254.40.47");
        String name=address.getHostName();
        String ip=address.getHostAddress();

        System.out.println("主机名："+name);
        System.out.println("Ip地址："+ip);
    }
}

package day_10;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//获取当前时间
public class One {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
//        SimpleDateFormat formatter =new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
        SimpleDateFormat format = new SimpleDateFormat("");
        System.out.println(format.format(c.getTime()));
    }
}

package day_10;

import java.util.HashMap;
import java.util.Map;

//通过containskey判断集合中是否有此键
public class Three2 {
    public static void main(String[] args) {
        Map<Integer,String> c=new HashMap<>();
       c.put(1,"g");
       c.put(2,"h");
       c.put(3,"j");
       System.out.println(c.containsKey(1));
       System.out.println(c.containsKey(2));
        System.out.println(c.containsValue("g"));
        System.out.println(c.containsValue("h"));
}
}

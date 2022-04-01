package day_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map集合通过键值对分别获取键和值
public class Three1 {
    public static void main(String[] args) {
        Map<Integer,String> b=new HashMap<>();
        b.put(1,"d");
        b.put(2,"e");
        b.put(3,"f");
        Set<Map.Entry<Integer, String>> c=b.entrySet();
        for(Map.Entry<Integer, String> entry:c){
            Integer key=entry.getKey();
            String  value=entry.getValue();
            System.out.println("key=" + key + "---" + "value=" + value);
        }
}
}

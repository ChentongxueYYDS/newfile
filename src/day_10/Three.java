package day_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//map集合中通过键获取值
public class Three {
    public static void main(String[] args) {
        Map<Integer,String> a = new HashMap<>();
        a.put(1,"a");
        a.put(2,"b");
        a.put(3,"c");
        Set<Integer> set=a.keySet();
        for(Integer key:set){
            String value=a.get(key);
            System.out.println("key=" + key + "---" + "value=" + value);
        }

    }
}

package day_10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//重写后的学生测试类，用Map接口做
public class Four1 {
    public static void main(String[] args) {
        Map<Four,String> d=new HashMap<>();
        Four d1=new Four("a",1);
        Four d2=new Four("b",2);
        Four d3=new Four("c",3);
        Four d4=new Four("d",4);
        d.put(d1,"nihao");
        d.put(d2,"fengle");
        d.put(d3,"pig");
        d.put(d4,"dog");
        Set<Four> student=d.keySet();
        for(Four key:student){
            String value=d.get(key);
            System.out.println(key + "---" + value);
        }
    }
}

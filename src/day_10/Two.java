package day_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//collection中list的使用
public class Two {
    public static void main(String[] args) {
        List<String> a=new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        System.out.println(a);
        Collections.shuffle(a);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
    }
}

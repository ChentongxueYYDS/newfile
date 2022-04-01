package day_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//比较器的测试类
public class Two2 {
    public static void main(String[] args) {
        List<Integer>  list=new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(5);
        System.out.println(list);
        Two1 a=new Two1();
        Collections.sort(list,a);
        System.out.println(list);


    }
}

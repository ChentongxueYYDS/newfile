package day_10;

import java.util.HashSet;
//HashSet不会出现两个重复的数组
public class Set {
    public static void main(String[] args) {
        HashSet<String> a = new HashSet<>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");
        a.add("d");
        System.out.println(a);
    }
}

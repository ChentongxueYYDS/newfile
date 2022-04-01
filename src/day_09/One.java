package day_09;
import java.util.ArrayList;
//ArrayList构造和添加方法巩固练习
public class One {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("hello");
        s.add("world");
        s.add("java");
        s.add(2,"zhouzhen");
        System.out.println(s);
    }
}

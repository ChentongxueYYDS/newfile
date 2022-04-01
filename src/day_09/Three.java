package day_09;

import java.util.ArrayList;

//ArrayList集合存储字符串并遍历重要步骤
public class Three {
    public static void main(String[] args) {
        ArrayList<String> A=new ArrayList<>();
        A.add("你好");
        A.add("我的朋友");
        A.add("你是谁");
        A.add("你来干嘛");
        for (int i=0;i<A.size();i++){
            String s=A.get(i);
            System.out.println(s);
        }
    }
}

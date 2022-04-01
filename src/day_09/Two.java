package day_09;

import java.util.ArrayList;

//创建一个集合，存储zhangsan  lisi  wangwu  zhaoliu  zhouqi
//删除lisi这个元素
//删除3索引处的元素
//将zhaoliu修改成zl
//获取集合长度
public class Two {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("zhangsan");
        s.add("lisi");
        s.add("wangwu");
        s.add("zhaoLiu");
        s.add("zhouqi");
        System.out.println(s);
        s.remove(1);
        System.out.println(s);
        s.set(3,"zl");
        System.out.println(s);
        int a=s.size();
        System.out.println(a);
    }
}

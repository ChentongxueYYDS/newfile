package day_12;

import java.util.ArrayList;

//如何用ArrayList集合实现字符串的遍历以及存储
public class Nine_one {
    public static void main(String[] args) {
        //思路：
        // 1.定义一个ArrayList对象；
        // 2.往集合中添加字符串；
        // 3遍历字符串；
        // 4.输出结果
        ArrayList<String> s = new ArrayList<String>();
        s.add("你好");
        s.add("我的朋友");
        s.add("你是最棒的");
        for (int i = 0; i < s.size(); i++) {
            String s1 = s.get(i);
            System.out.println("s1:" + s1);
        }
    }
    //两个明确:返回值类型：String;参数：String s
}
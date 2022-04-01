package day_08;
//字符串拼接升级版
public class Six {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        s.append("a");
        s.append("b");
        s.append("c");
        s.append("d");
        s.reverse();
        String s1=s.toString();
        System.out.println(s1);
    }
}

package shixun;
//通过纸张折叠求多少次超过珠穆拉玛峰的高度
public class Xunlian5 {
    public static void main(String[] args) {
        double i = 0.0001;
        int zhufeng = 8848;

        int count = 0;
        while (i<=zhufeng) {
            count++;
            i=i*2;
            }
        System.out.println("总共折叠了"+count+"次");
        }
    }


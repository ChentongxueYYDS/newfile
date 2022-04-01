package shixun;
//for循环与while循环都是先判断再执行,do-while循环是先执行，再判断；
public class Xunhuan1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i * j;
                System.out.print(i + "*" + j + "=" + sum + "\t");
            }
            System.out.println(" ");
//        }
//        int i=1;
//        while (i<=100){
//            System.out.println("好好学习，天天向上");
//            i++;
//        }
//
//        int i = 1;
//        do {
//            System.out.println("好好学习");
//            i++;
//        }
//        while (i <=100);
        }
    }
}
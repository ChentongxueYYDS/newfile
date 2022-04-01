package shixun1;
//从1-100之间找到包含7且是7的倍数
public class Two {
    public static void main(String[] args) {
        int count = 0;
//        int y=0;
        for (int i = 1; i <= 100; i++) {
            if (i/10==7 || i % 7==0 || i%10==7) {
                System.out.print(i + " ");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
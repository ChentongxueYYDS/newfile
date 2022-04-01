package day_13;

public class Seven {
    public static void main(String[] args) {
        //逢9跳过
        //每五个进行跳跃
        int count = 0;
//        int y=0;
        for (int i = 1; i <= 100; i++) {
            if (i / 10 != 9 && i % 10 != 9) {
                System.out.print(i + " ");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}

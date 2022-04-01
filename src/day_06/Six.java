package day_06;

//百钱百鸡
//公鸡5文钱一只、母鸡3文钱一只、小鸡1文钱三只
public class Six {
    public static void main(String[] args) {
//        for (int i = 1; i <= 20; i++) {
//            for (int j = 1; j <= 33; j++) {
//                for (int k = 1; k <= 300; k++) {
//                    if (i + j + k == 100 && i * 5 + j * 3 + k * 1 / 3 == 100 && k%3==0) {
//                        System.out.println("i:" + i + "," + "j:" + j + "," + "k:" + k);
//                    }
//                }
//            }
//        }
        int rooster, hen, chick;
        for (rooster = 1; rooster <= 20; rooster++) {
            for (hen = 1; hen <= 33; hen++) {
                chick = 100 - rooster - hen;
                if (5 * rooster + 3 * hen + (1.0 / 3.0) * chick == 100 && chick % 3 == 0) {
                    System.out.println("rooster:" + rooster + "\then:" + hen + "\t  chick:" + chick);
                }
            }
        }
    }
}

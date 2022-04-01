package shixun;

import java.util.Random;

public class Duofenzhi_choujiang {
    public static void main(String[] args) {
        getchoujiang();
    }
    public static void getchoujiang() {
        int[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Random a = new Random();
        for (int j = 10; j > 0; j--) {
            int index = a.nextInt(j);
            int k = arr[index];
            arr[index] = arr[j - 1];
            arr[j - 1] = k;
        }
        int result = 0;
        for (int i = 0; i < 6; i++) {
            result = result * 10 + arr[i];
        }
        System.out.println("你的彩票号码为：" + result);
        if (result == 1234567) {
            System.out.println("买车，资助希望工程，去欧洲旅游");
        } else {
            System.out.println("买下一期体彩，继续烧高香");
        }
    }
}
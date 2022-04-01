package shixun1;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int l = s.nextInt();
        System.out.println("这个可以求得这个数所有的加法可能");
        int sum = l;
        int j = 0;
        for (int i = 1; i <= l; i++) {
            j = sum - i;
            System.out.println(i + "+" + j + "=" + sum);
        }
    }
}


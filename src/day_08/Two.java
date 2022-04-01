package day_08;

import java.util.Scanner;

//遍历字符串
public class Two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        for (int i = 0; i < name.length(); i++) {
            char a = name.charAt(i);
            System.out.print(a + ",");
        }
    }
}

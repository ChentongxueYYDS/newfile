package day_08;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner s = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name1 = s.nextLine();
            System.out.println("请输入密码");
            String password1 = s.nextLine();
            String name = "chen";
            String password = "123";
            if (name1.equals(name) && password1.equals(password)) {
                System.out.println("用户名相同" +","+ "密码相同");
                break;
            } else {
                System.out.println("请重新输入");
            }
        }
    }
}
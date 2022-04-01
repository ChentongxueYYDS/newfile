package day_13;

import java.util.Scanner;

//根据工龄进行一个工资的判断
public class Night {
    public static void main(String[] args) {
        //给出基本工资base=3000
        int base = 3000;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入工作的年限");
        int workyear = s.nextInt();
        if (workyear >= 0 && workyear < 1) {
            int base1 = base + 200;
            System.out.println("您目前工作了" + workyear + "年,基本工资为3000元,应涨工资" + 200 + "元,涨后工资" + base1 + "元");
        } else if (workyear >= 1 && workyear < 3) {
            int base2 = base + 500;
            System.out.println("您目前工作了" + workyear + "年,基本工资为3000元,应涨工资" + 500 + "元,涨后工资" + base2 + "元");
        } else if (workyear >= 3 && workyear < 5) {
            int base3 = base + 1000;
            System.out.println("您目前工作了" + workyear + "年,基本工资为3000元,应涨工资" + 1000 + "元,涨后工资" + base3 + "元");
        } else if (workyear >= 5 && workyear < 10) {
            int base4 = base + 2500;
            System.out.println("您目前工作了" + workyear + "年,基本工资为3000元,应涨工资" + 2500 + "元,涨后工资" + base4 + "元");
        } else if (workyear >= 10 && workyear < 15) {
            int base5 = base + 5000;
            System.out.println("您目前工作了" + workyear + "年,基本工资为3000元,应涨工资" + 5000 + "元,涨后工资" + base5 + "元");
        }
    }
}

package shixun1;
//计算1-100不能被三整除求和
public class Seven {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                sum += i;
                count++;
                System.out.print(i + "\t");
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
            System.out.println();
            System.out.println("1-100的不能被3整除的和为：" + sum);
        }
    }

package kaoshi;

import java.util.Arrays;
import java.util.Random;

//设定一个范围为[10-99]，且长度为5的随机数组，降序输出
public class Three {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("排序前的数组为：");
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int r1 = r.nextInt(90) + 10;
            arr[i] = r1;
            System.out.print(arr[i]+"\t");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("降序后的数组为:");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j]+"\t");
        }
    }
}

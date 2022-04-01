package day_06;

import java.lang.reflect.Array;
import java.util.Arrays;

//比较两个int数组内容
    public class Ten1 {
        public static void main(String[] args) {
            int [] arr1={1,2,3};
            int [] arr2={1,3};
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println("两个数组相同");
            }else {
                System.out.println("两个数组不相同");
            }
        }
}

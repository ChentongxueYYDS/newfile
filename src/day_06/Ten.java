package day_06;

import java.util.Arrays;

//数组内容是否相同巩固练习，代码不完整，但是不知道怎么改了
public class Ten {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5};
        int[] arr2 = new int[]{1, 2, 5, 3};
        boolean decide = Compare(arr, arr2);
        String result;
        if (decide == false) {
            result = "arr和arr2这两个数组相同";
        } else {
            result = "arr和arr2是两个不同的数组";
        }
        System.out.println(result);
    }
    public static boolean Compare(int[] arr, int[] arr2) {
        boolean decide = true;
        if (arr.length != arr2.length) {
            decide = false;
        } else {
            for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != arr2[i]) {
                        decide = true;
                    } else {
                        decide = false;
                    }
                }
            }
        return decide;
        }

    }


package day_10;

import java.lang.reflect.Array;
import java.util.Arrays;

//从小到大排序和从大到小排序
public class Five {
    public static void main(String[] args) {
        int [] arr={1,3,2,4,5};
        int pop;
        for(int i=0;i<arr.length-1;i++){
               for(int j=i+1;j<arr.length;j++){
                   if(arr[i]<arr[j]){
                       pop=arr[i];
                       arr[i]=arr[j];
                       arr[j]=pop;
                   }
               }
           }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }

        }

    }

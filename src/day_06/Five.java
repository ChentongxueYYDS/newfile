package day_06;

//不死神兔
//方法是n-2+n-1;
public class Five {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        int count=2;
            for (int j=2;j<arr.length;j++){
                arr[j]=arr[j-2]+arr[j-1];
                count++;
                System.out.println("第"+count+"个月的兔子数为:"+arr[j]);
            }
//
        }
    }


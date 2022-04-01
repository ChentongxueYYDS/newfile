package day_04;
//获取数组的最大值
public class Four {
    public static void main(String[] args) {
        int [] arr1={11,22,33,44,55};
//        int max=arr1[0];//最大值
        int min=arr1[0];//最小值
        for(int i=0;i<arr1.length;i++){
//            if(max<arr1[i]){
//               max=arr1[i];
//            }
            if(min>arr1[i]){
                min=arr1[i];
            }
        }
//        System.out.println(max);
        System.out.println(min);
    }
}


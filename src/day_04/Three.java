package day_04;
//多个数组指向相同内存
//arr2[]把arr1[]的值给替换了，相当于刘创建了一个有关于arr2的新建了一个栈内存空间
public class Three {
    public static void main(String[] args) {
        double [] arr1=new double[3];
        arr1[0]=4.05;
        arr1[2]=5.26;
        double [] arr2=arr1;
        arr2[0]=5.36;
        arr2[2]=4.28;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println("=========");
        System.out.println(arr1[2]);
        System.out.println(arr2[2]);
    }
}

package day_05;
//用方法比较两个数的大小
//如果方法中没有输出语句，在主方法中就需要输出，如果在方法中有输出，在主方法中只需要调用就可以了
public class one {
    public static void main(String[] args) {
        System.out.println(getMax(5,4));
    }
    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}

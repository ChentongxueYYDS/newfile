package day_05;
//无参无返回值的调用和带参无返回值的调用以及带参带返回值的调用
public class Four {
    public static void main(String[] args) {
        //无参无返回值的调用
//        getmessage();
        //带参无返回值的调用
//        getmax(4,5);
        //带参带返回值的调用
        System.out.println(getmax(5,6));

    }
//    public static void getmessage(){
//        System.out.println("helloworld");
//    }
//    public static void getmax(int a,int b){
//        if(a>b){
//            System.out.println(a);
//        }else {
//            System.out.println(b);
//        }
//}
    public static int getmax(int a,int b){
        int c=a>b?a:b;
        return  c;
    }
}

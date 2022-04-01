package day_05;
//需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数。
public class Two {
    public static void main(String[] args) {
        System.out.println(isEvelement(24));
    }
    public static boolean isEvelement(int n){
//        if(n%2==0){
//            return true;
//        }else {
//            return false;
//        }
        //三元运算符
        boolean c=n%2==0?true:false;
        return  c;
    }
}

package day_06;
//创建一个求1~10之间的偶数和程序,并用Debug模式查看偶数求和
public class One {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

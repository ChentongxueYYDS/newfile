package kaoshi;
//求整数1-100的累加和
public class Two {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=100;i++){
            if(i%10!=3){
                sum+=i;
            }
        }
        System.out.println("1-100除开个位数为3的和为"+sum);
    }
}

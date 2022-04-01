package shixun1;
//1-1000之间的累加，加到888的时候跳出循环
public class Night {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for(int i=1;i<=1000;i++){
            sum+=i;
            count++;
            if(sum>=888){
                System.out.println(sum);
                System.out.println("一共计算了"+count+"次");
                break;
            }
        }
    }
}

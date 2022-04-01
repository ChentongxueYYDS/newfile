package day_06;
//数组元素求和，求1-100内不包含7的偶数的和(题目有点问题，都是偶数了，怎么可能有跟7有关的数)
public class Nine {
    public static void main(String[] args) {
        int sum=0;
        for (int i=0;i<=100;i++){
            if(i%10==7 && i==7){
                System.out.print("");
            }else{
                if(i%2==0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}

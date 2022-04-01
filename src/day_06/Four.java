package day_06;
//逢七过，1-100之前的数
public class Four {
    public static void main(String[] args) {
        int a=1;
        int b=100;
        int count=0;
        for (int i=a;i<=b;i++){
            if(i%7==0 || i%10==7){
                System.out.print("");
            }else{
                System.out.print(i+",");
                count++;
                if(count%10==0){
                    System.out.println();
                }
                }
            }
        System.out.println();
        System.out.println(a+"到"+b+"之前有"+count+"个数满足条件");
        }

    }


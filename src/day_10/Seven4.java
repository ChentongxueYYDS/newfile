package day_10;
//打印9*9乘法口诀表
public class Seven4 {
    public static void main(String[] args) {
        getkoujue();
    }
    public static void getkoujue(){
        int sum=0;
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                sum=i*j;
                System.out.print(j+"*"+i+"="+sum);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

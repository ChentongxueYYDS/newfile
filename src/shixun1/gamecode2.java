package shixun1;
//杨辉三角
public class gamecode2 {
    public static void main(String[] args) {
        int length=6;
        int [][]arr=new int[length][length];
        for(int i=0;i<length;i++){
            for (int j=0;j<=i;j++){
                if(j==0|| j==i){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }

        }
        //等腰输出
        for(int i=0;i<length;i++){
            for(int j=0;j<arr.length-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(arr[i][k]+" ");
            }
            System.out.println();
        }

    }
}

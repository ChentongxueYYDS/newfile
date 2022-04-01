package shixun1;

import java.util.Scanner;

//成绩判断，统计大于85分的个数
public class gamecode {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int count=0;
        for(int i=0;i<3;i++){
            int sum=0;
            System.out.println("请输入第"+(i+1)+"个班级的成绩");
            for(int j=0;j<3;j++){
                System.out.print("请输入第"+(j+1)+"个学员的成绩");
                int num2=s.nextInt();
                if(num2>85){
                    count++;
                }
                sum+=num2;
            }
            double aver=sum/4;
            System.out.println("第"+(i+1)+"个班的平均分为"+aver);

        }
        System.out.println("三个班超过85分的人数有"+count+"个");
    }
}

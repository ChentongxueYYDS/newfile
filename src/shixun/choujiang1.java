package shixun;

import java.util.Random;
import java.util.Scanner;

//抽奖小游戏
public class choujiang1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String jixu;
        int arr[]=new int[2];
        String arr1[]=new String[2];
        do {
            System.out.println("*****欢迎使用抽奖*****");
            System.out.println("\t\t1.注册\t\t");
            System.out.println("\t\t2.登录\t\t");
            System.out.println("\t\t3.抽奖\t\t");
            System.out.println("*********************");
            System.out.println("请选择");
            int a = s.nextInt();
            Random r=new Random();
            int s4=r.nextInt(9000)+1000;
            switch (a) {
                case 1:
                    System.out.println("[抽奖系统>注册]");
                    System.out.println("请填写个人信息");
                    System.out.print("用户名:");
                    String s2=s.next();
                    arr1[0]=s2;
                    System.out.print("密码:");
                    int s3=s.nextInt();
                    arr[0]=s3;
                    System.out.println("注册成功，请保存好账户信息！");
                    arr[1]=s4;
                    System.out.println("用户名\t"+"密码\t"+"会员");
                    System.out.println(s2+"\t\t"+s3+"\t\t"+s4);
                    break;
                case 2:
                    /*if(name.equals(arr1[0]) && password==arr[0]){
                        System.out.println("欢迎你"+name+"会员卡号是\t"+arr[1]);
                    }else {
                        System.out.println("你的账号或者密码输入错误");
                    }
                    break;*/
                    int count1=0;
                    for(int i=3;i>=1;i--){
                        System.out.println("请输入你的用户名：");
                        String name=s.next();
                        System.out.println("请输入你的密码：");
                        int password=s.nextInt();
                        if(name.equals(arr1[0]) && password==arr[0]){
                            System.out.println("欢迎你"+name+"会员卡号是\t"+arr[1]);
                            break;
                        }else {
                            System.out.println("你的账号或者密码输入错误你还有"+(i-1)+"次机会");
                            if(i==1){
                                System.out.println("对不起，系统已关闭\n");
                                return;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("请输入你的会员号");
                    int s6=s.nextInt();
                    int count=0;
                    for(int j=1;j<=4;j++) {
                        int s5 = r.nextInt(9000) + 1000;
                        System.out.print(s5+ "\t");
                        if (s6 == s5) {
                            count++;
                        }
                    }
                    if(count==0){
                        System.out.println("抱歉你没有中奖，请再接再厉");
                    }
                    else {
                        System.out.println("恭喜你中奖了");
                    }
                   break;
                default:
                    System.out.println("请按照正确的数字输入：");
                    break;
            }

            System.out.println("是否继续（y/n）:");
            jixu=s.next();
        }
        while ("y".equals(jixu));
        System.out.println("谢谢使用本系统");
        }

    }

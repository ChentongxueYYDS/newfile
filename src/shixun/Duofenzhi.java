package shixun;
//多分支Switch....case
public class Duofenzhi {
    public static void main(String[] args) {
        //案例一
        //        int a=(int)(Math.random()*4);
//        System.out.println("随机生成的数为："+a);
//        switch (a){
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            default:
//                System.out.println("4");
//                break;
//        }
        //案例二
        int a=(int)(Math.random()*10);
        System.out.println("韩嫣获得了第："+a+"名");
        switch (a){
            case 1:
                System.out.println("参加。。。。。");
                break;
            case 2:
                System.out.println("奖励笔记本电脑一部");
                break;
            case 3:
                System.out.println("奖励硬盘");
                break;
            default:
                System.out.println("不给任何奖励");
                break;
        }
    }

}

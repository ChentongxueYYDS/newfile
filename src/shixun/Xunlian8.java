package shixun;
//计算100以内的偶数和
public class Xunlian8 {
    public static void main(String[] args) {
        //获取100以内的偶数和
        geto();
        //获取100以内的奇数和
//        getj();
    }
    public static void geto() {
        //1.for循环
        //        int sum=0;
//        for(int i=0;i<=100;i++){
//            if(i%2==0){
//                sum+=i;
//            }
//        }
//        System.out.println("100以内的偶数和为："+sum);

        //2.do-while循环
        int i =1;
        int osum =0;
        int jsum=0;
        int sum=0;
        do {
            sum += i;
            if (i % 2 == 0) {
                osum += i;
            }else {
                jsum+=i;
            }
            i++;
        }
        while (i<=100);
        System.out.println("100以内的偶数和为：" + osum);
        System.out.println("100以内的奇数和为：" + jsum);
        System.out.println("100以内的整数和为："+sum);
    }

//        //3.while循环
//        int i=0;
//        int sum=0;
//      while (i<=100){
//          if(i%2==0){
//              sum+=i;
//          }
//         i++;
//      }
//        System.out.println("100以内的偶数和为："+sum);
//    }
//        public static void getj(){
//            int sum1 = 0;
//            for (int j = 0; j <= 100; j++) {
//                if (j % 2 != 0) {
//                    sum1 += j;
//                }
//            }
//            System.out.println("100以内的奇数和为：" + sum1);
//       }
    }


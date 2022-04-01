package day_06;

import java.math.BigDecimal;
//float和double在处理小数的问题上都有精准度出现误差的情况
//解决方法：用BigDecimal去处理就可以了。不过它每次计算的时候都需要新建一个BigDecimal对象
public class Seven {
    public static void main(String[] args) {
        BigDecimal f1=new BigDecimal("10.1");
        for (int i=0;i<10;i++){
            f1=f1.add(new BigDecimal("1"));
        }
        System.out.println(f1);
    }
}

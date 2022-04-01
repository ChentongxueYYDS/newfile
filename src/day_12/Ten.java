package day_12;

import day_12.Ten_Student;
import java.util.ArrayList;
import java.util.Scanner;

//ArrayList遍历集合并存储，使用方法；
public class Ten {
    public static void main(String[] args) {
        //思路：
        // 1.新建一个学生类，定义姓名（name），年龄（age）；
        // 2.新建Arraylist对象；
        // 3.使用方法获取输入的值并实现遍历；
        // 4.使用Scanner获取输入的值；
        // 5.遍历整个字符串，获取相应的值；
        // 6.调用方法；
        // 7.输出结果；
        ArrayList<Ten_Student> s=new ArrayList<Ten_Student>();
        Arraycollection(s);
        Arraycollection(s);
        Arraycollection(s);
        //遍历集合，获取各个元素值输出
        for(int i=0;i<s.size();i++){
            Ten_Student student = s.get(i);
            System.out.println("name:"+student.getName()+","+"age:"+student.getAge());
        }

    }
    //两个明确：返回值类型：void；参数:ArrayList<Student> array
    public static void Arraycollection(ArrayList<Ten_Student> array){
        Scanner s=new Scanner(System.in);
        System.out.println("请输入你的名字");
        String name=s.nextLine();
        System.out.println("请输入你的年龄");
        String age=s.nextLine();
        //创建学生对象
        Ten_Student  s1=new Ten_Student();
        s1.setName(name);
        s1.setAge(age);
        array.add(s1);
    }
}

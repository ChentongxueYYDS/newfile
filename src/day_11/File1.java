package day_11;
import java.io.IOException;
import java.io.File;
//获取文件和获取目录的方法，获取文件是用createFile(),获取单级目录是用mkdir()方法
//获取多级目录是用mkdirs()方法
public class File1 {
    //C:\Users\chen\Desktop\JAVA
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\Java\\itcast\\java.txt");
        System.out.println(f1.createNewFile());
        File f2=new File("D:\\Java\\itcast\\javaweb\\java1.txt");
        System.out.println(f2.mkdirs());
    }
}

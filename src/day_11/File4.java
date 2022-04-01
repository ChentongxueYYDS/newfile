package day_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//如果fis.read()括号中如果没有参数的话，会输出默认的0；
//字节流读数据
public class File4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\hello\\A.png");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\chen\\IdeaProjects\\untitled1\\untitled1\\A.png");
        byte[] a=new byte[1024];
        int len;
        while ((len=fis.read(a))!=-1) {
           fos.write(a,0,len);
        }
        fis.close();
        fos.close();
    }
}

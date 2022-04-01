package day_11;

import java.io.*;

//Buff,缓冲流输入，输出数据；
public class File5 {
    public static void main(String[] args) throws IOException {
//        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\chen\\IdeaProjects\\untitled1\\untitled1\\box.txt"));
//        bos.write("hello\r\n".getBytes());
//        bos.write("world\r\n".getBytes());
//        bos.close();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\chen\\IdeaProjects\\untitled1\\untitled1\\box.txt"));
//缓冲流输出数据，输出方式：：一次输出一个字节；
        //        int by;
//        while ((by = bis.read()) != -1) {
//            System.out.print((char) by);
//        }

        //缓冲流输出数据，输出方式：一次输入一个字节数组；
        byte[] bos=new byte[1024];
        int len;
        while ((len=bis.read(bos))!=-1){
            System.out.println(new String(bos,0,len));
        }
    }
}
package day_11;
//FileoutputStream写入数据的三种方法
//1-int
//2-byte[]
//3-byte[],int off,int end
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream file=new FileOutputStream("untitled1\\itcast.txt");
//        file.write(97);
//        file.write(98);
//        file.write(99);
//        file.write(100);
//        file.write(101);
        byte[] bytes="abcde".getBytes();
        file.write(bytes,0,3);
        file.close();
    }
}

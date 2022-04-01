package day_11;

import java.io.File;

//遍历目录
public class File2 {
    public static void main(String[] args) {
        File file=new File("D:\\Java\\itcast");
        getAllfilePath(file);
    }
    public static void getAllfilePath(File srcfile){
        File[] filearr=srcfile.listFiles();
        for(File file:filearr){
            if(file.isDirectory()){
                getAllfilePath(file);
            }
            else {
                System.out.println(file.getAbsolutePath());
            }
        }

    }
}
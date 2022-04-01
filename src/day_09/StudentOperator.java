package day_09;

import javax.naming.CompoundName;
import java.util.ArrayList;

//学生测试类
public class StudentOperator {
    ArrayList<Student> stus=new ArrayList<Student>();
        //菜单------------------
    public void menu() {
        System.out.println("*********学生管理系统欢迎你********");
        System.out.println("1.增加学生");//增加学生
        System.out.println("2.根据学号修改学生信息");//
        System.out.println("3.查看所有学生信息");
        System.out.println("4.根据学号查看某一个学生信息");
        System.out.println("5.根据性别查看同性别的所有学生");
        System.out.println("6.根据学号删除某一个学生");
        System.out.println("7.按照学号升序排序（默认）");
        System.out.println("8.按照年龄降序排序");
        System.out.println("*********下面请按照要求操作********");
        System.out.println("请输入选项：");
    }
        //------------------

        //1.增加学生
    public boolean addStudent(Student stu){
        if(stus!=null){
            stus.add(stu);
            return true;
        }
        return false;
    }

        //2.根据学号修改学生信息
    public boolean updateStudent(Student stu) {
        if(stus!=null){
            for (int i=0;i<stus.size();i++){
                Student s=stus.get(i);
                if(s.getStusid()==stu.getStusid()){
                    stus.set(i,stu);//重置
                    return true;
                }
            }
        }
        return false;
    }
         //3.查看所有的学生信息
    public void showStudent(){
        for(Student stu:stus){
            System.out.println(stu);
        }
    }
         //4.根据学号查看某一个学生信息
        public Student queryStubyld(int stusid){
            for(Student stu:stus){
                if(stu.getStusid()==stusid){
                    return stu;
                }
            }
            return null;
        }
        //5.根据性别查看同性别的所有学生
        public ArrayList<Student> queryStubysex(String sex){
            ArrayList<Student> sexArr=new ArrayList<Student>();
            for(Student stu:stus){
                if(stu.getSex().equals(sex)){
                    sexArr.add(stu);
                }
            }
           return sexArr;
        }
        //6.根据学号删除一个学生
        public boolean delatestuByld(int stusid){
            Student stu=this.queryStubyld(stusid);
            return stus.remove(stu);
        }
        //7.按照学号升序排序（默认）
        public void sortByldsid(){
            for(int i=0;i<stus.size()-1;i++){
                for(int j=0;j<stus.size()-i-1;j++){
                    if(stus.get(j).getStusid()>stus.get(j+1).getStusid()){
                        Student stu=stus.get(j);
                        stus.set(j,stus.get(j+1));
                        stus.set(j+1,stu);
                    }
                }
            }
        }
        //8.按照年龄降序排序
        public void sortByldage(){
            for(int i=0;i<stus.size()-1;i++){
                for(int j=0;j<stus.size()-1-i;j++){
                    if(stus.get(j).getAge()<stus.get(j+1).getAge()){
                        Student stu=stus.get(j);
                        stus.set(j,stus.get(j+1));
                        stus.set(j+1,stu);
                    }
                }
            }
        }
    }


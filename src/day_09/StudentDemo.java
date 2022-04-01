package day_09;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        StudentOperator stuop=new StudentOperator();
        Scanner input=new Scanner(System.in);
        while(true){
            stuop.menu();//输出菜单
            int number=input.nextInt();//录入键盘输入的数字
            Student stu=new Student();
            //number==1-----添加学生
            if(number==1){
                //添加学生属性
                System.out.println("请输入学生信息(学号，姓名，年龄，性别，家庭地址)");
//                String i=input.next();
//                String j=input.next();
//                String k=input.next();
//                String h=input.next();
//                System.out.println("------------");
//                System.out.println(i+" "+j+" "+k+" "+h);

                stu.setStusid(input.nextInt());
                stu.setName(input.next());
                stu.setAge(input.nextInt());
                stu.setSex(input.next());
                stu.setAddress(input.next());
                boolean boo=stuop.addStudent(stu);
                if(boo){
                    System.out.println("添加成功");
                }
            }
            //number==2-----根据学号修改学生信息
            if(number==2){
                System.out.println("请输入学生信息(学号，姓名，年龄，性别，家庭地址)");
                stu.setStusid(input.nextInt());
                stu.setName(input.nextLine());
                stu.setName(input.nextLine());
                stu.setSex(input.nextLine());
                stu.setAddress(input.nextLine());
                boolean boo=stuop.updateStudent(stu);
                if(boo){
                    System.out.println("修改成功");
                }else{
                    System.out.println("没有找到学号为"+stu.getStusid()+"的学生");
                }
            }
            //number==3-----查看所有学生的信息
            if(number==3){
                stuop.showStudent();
            }
            //number==4-----根据学号查看某一个学生的信息
            if(number==4){
                System.out.println("请输入学生的学号：");
                stu.setStusid(input.nextInt());
                System.out.println(stuop.queryStubyld(stu.getStusid()));
            }
            //number==5-----根据性别查看所有同性别的所有学生
            if(number==5){
                System.out.println("请输入学生的性别：");
                stu.setSex(input.next());
                System.out.println(stuop.queryStubysex(stu.getSex()));
            }
            //number==6-----根据学号删除某一个学生
            if(number==6){
                System.out.println("请输入要删除学生的学号");
                stu.setStusid(input.nextInt());
                boolean boo=stuop.delatestuByld(stu.getStusid());
                if(boo){
                    System.out.println("删除成功！");
                }else{
                    System.out.println("没有找到学号为"+stu.getStusid()+"的学生");
                }
            }
            //number==7-----按照学号升序排序（默认）
            if(number==7){
                stuop.sortByldsid();
                stuop.showStudent();
            }
            //number==8-----按照年龄降序排序
            if(number==8){
                stuop.sortByldage();
                stuop.showStudent();
            }
        }
    }
}

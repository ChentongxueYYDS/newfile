package day_09;
//创建一个学生类
public class Student {
    private  String name;
    private  int  age;
    private int stusid;
    private String address;
    private String sex;
    public void Student(){}
    public void Student(String name,int age){
        this.name=name;
        this.age=age;
        this.stusid=stusid;
        this.address=address;
        this.sex=sex;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public  void setAge(int age){
        this.age=age;
    }

    public int getStusid() {
        return stusid;
    }

    public void setStusid(int stusid) {
        this.stusid = stusid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student[学号:"+stusid+",姓名:"+name+",年龄:"+age+",性别"+sex+",地址:"+address+"]";
    }
}

package day_12;
//新建一个学生类
public class Ten_Student {
   String name;
   String age;
   public Ten_Student(){}
   public Ten_Student(String name,String age){
       this.name=name;
       this.age=age;
   }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
}

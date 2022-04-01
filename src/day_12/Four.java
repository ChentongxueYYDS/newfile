package day_12;
//封装用private
public class Four {
    private String name;
    private int age;
    public Four(){
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}

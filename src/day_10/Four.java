package day_10;

import java.util.Objects;

//创建学生类对象并重写hashcode()和equals()方法
public class Four {
    String name;
     int age;
    public Four(){}
    public Four(String name,int age){
        this.name=name;
        this.age=age;
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Four four = (Four) o;
        return age == four.age &&
                Objects.equals(name, four.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    @Override
    public String toString() {
        return "Four{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

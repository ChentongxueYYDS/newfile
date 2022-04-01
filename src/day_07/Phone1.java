package day_07;

public class Phone1 {
    private String name;
    private int age;
    private String xinhao;
    public void Phone1(){}
    public void Phone1(String name,int age,String xinhao){
        this.name=name;
        this.age=age;
        this.xinhao=xinhao;
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

    public String getXinhao() {
        return xinhao;
    }

    public void setXinhao(String xinhao) {
        this.xinhao = xinhao;
    }
    public void call(){
        System.out.println("打电话");
    }
    public void transmit(){
        System.out.println("发信息");
    }
}

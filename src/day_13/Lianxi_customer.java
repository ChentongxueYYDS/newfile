package day_13;
//客户信息管理
public class Lianxi_customer {
    private String name;
    private int V;
    public Lianxi_customer(){}
    public  Lianxi_customer(String name,int V){
        this.name=name;
        this.V=V;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int  getV() {
        return V;
    }
    public void setV(int v) {
        V = v;
    }

}

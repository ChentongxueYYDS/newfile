package shixun;

public class Duofenzhi_customermassage {
   private String name;
   private String Vip;
   public Duofenzhi_customermassage(){}
   public Duofenzhi_customermassage(String name,String Vip){
       this.name=name;
       this.Vip=Vip;
   }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVip() {
        return Vip;
    }
    public void setVip(String vip) {
        Vip = vip;
    }
}

package Com.Company;

interface bicycle{
    int a = 10;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface blowhorn{
    void blohhornkgf();
    void blohhornpat();
}
class avon implements bicycle, blowhorn{
    public void  applyBrake(int decrement){
        System.out.println("Decrement by "+decrement);
    }
    public void speedUp(int increment){
        System.out.println("Increment by "+increment);
    }
    public void blohhornkgf(){
        System.out.println("KGF");
    }
    public void blohhornpat(){
        System.out.println("PAt");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        avon ne = new avon();
        ne.applyBrake(100);
        ne.speedUp(90);
        System.out.println(ne.a); // You can create properties in interfaces
        //ne.a = 45; // You can not update properties
        System.out.println(ne.a);
        ne.blohhornkgf();
        ne.blohhornpat();
    }
}

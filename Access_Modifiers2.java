package Com.Company;

class c1{
    public int a = 8;
    protected int b = 9;
    int c = 10;
    private int d = 11;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class Access_Modifiers2 {
    public static void main(String[] args) {
        c1 c = new c1();
        //c.meth1();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        //System.out.println(c.d);  --> Throws an error because d is private
    }
}

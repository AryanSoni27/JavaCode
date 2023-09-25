package Com.Company;

abstract class base2{

    public base2(){
        System.out.println("I am a constructor of class base2");
    }

    public void sayHello(){
        System.out.println("Hello!!");
    }

    abstract public void greet();
}

class child extends base2{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}
public class Abstract_Class_Method {
    public static void main(String[] args) {
        child c = new child();
        System.out.println();
    }
}

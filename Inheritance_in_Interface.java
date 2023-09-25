package Com.Company;

interface MyInterface{
    void method1();
    void method2();
}

interface ChildInterface extends MyInterface{
    void method3();
    void method4();
}

class Interface implements ChildInterface{
    public void method1(){
        System.out.println("Method 1");
    }public void method2(){
        System.out.println("Method 2");
    }public void method3(){
        System.out.println("Method 3");
    }public void method4(){
        System.out.println("Method 4");
    }
}

public class Inheritance_in_Interface {
    public static void main(String[] args) {
        Interface a = new Interface();
        a.method1();
        a.method2();
        a.method3();
        a.method4();
    }
}

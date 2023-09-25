package Com.Company;

class base1{
    base1() {
        System.out.println("I am a Constructor");
    }
    base1(int a) {
        System.out.println("I am an overloaded constructor with value of a: "+a);
    }
}

class derived1 extends base1{
    derived1(){
        //super(50); //-->Used to execute the overloaded constructor of base class
        System.out.println("I am a derived class constructor");
    }
    derived1(int a, int b){
        super(a); //-->Used to execute the overloaded constructor of base class
        System.out.println("I am a derived class constructor with value of b is:"+b);
    }
}

class childofderived extends derived1{
    childofderived(){
        System.out.println("I am a child of derived class constructor");
    }
    childofderived(int a, int b, int c){
        super(a,b);
        System.out.println("I am a child of derived class constructor with value of c:"+c);
    }
}
public class Constructors_in_Inheritance {
    public static void main(String[] args) {
        //base1 a = new base1();
        //derived1 b = new derived1();
        //derived1 b = new derived1(50,80);
        childofderived cd = new childofderived(5,6,5);
    }
}

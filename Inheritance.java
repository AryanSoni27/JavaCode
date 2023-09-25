package Com.Company;


class animal{
    int a;
    public int getA(){
        return a;
    }
    public void setA(int a){
        System.out.println("Animal Barks");
        this.a=a;
    }
}

class dog extends animal{
    int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base class and setting X");
        this.x = x;
    }
}

class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class Inheritance {
    public static void main(String[] args) {
        //Creating an object of base class
        //derived b = new derived();
        //b.setX(50);
        //System.out.println(b.getX());

        //Creating an object of derived class
        //derived d = new derived();
        //d.setX(50);
        //System.out.println(d.getX());

        //Creating an object of animal class
        animal a = new animal();
        a.setA(60);
        System.out.println(a.getA());

        //Creating an object of dog class
        animal c = new dog();
        c.setA(70);
        System.out.println(c.getA());
    }
}

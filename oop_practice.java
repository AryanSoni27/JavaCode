package Com.Company;

//class employee{
//    int salary;
//    static String name;
//
//    public int getSalary(){
//        return salary;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String n){
//        name = n;
//    }
//}

class cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void Vibrating(){
        System.out.println("Vibrating...");
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int peri(){
        return 4*side;
    }
}

class game{
    public void hit(){
        System.out.println("Hitting...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void fire(){
        System.out.println("Firing...");
    }
}

class circle{
    float r;
    public float area(){
        return (float) (3.14*r*r);
    }
    public float perimeter(){
        return (float) (3.14*2*r);
    }
}

class rectangle{
    int length;
    int breath;
    public int area(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length+breath);
    }
}
public class oop_practice {
    public static void main(String[] args) {
        /*
        //Problem 1
        //employee aryan = new employee();
        //aryan.setName("Aryan");
        //System.out.println(aryan.getName());
        //aryan.salary = 100;
        //System.out.println(aryan.getSalary());

        //Problem 2
        cellphone one = new cellphone();
        one.ringing();
        one.Vibrating();

        //Problem 3
        square one = new square();
        one.side = 10;
        System.out.println("Area of Square is:" + one.area());
        System.out.println("Perimeter of Square is:" + one.peri());

        //Problem 4
        game arr = new game();
        arr.fire();
        arr.hit();
        arr.run();

        //Problem 4
        circle cir = new circle();
        cir.r = 5f;
        System.out.println("The area of circle is:" + cir.area());
        System.out.println("The perimeter of circle is:" + cir.perimeter());
        */

        //Problem 5
        rectangle first = new rectangle();
        first.length = 10;
        first.breath = 10;
        System.out.println("The area of Rectangle is:" + first.area());
        System.out.println("The Perimeter of Rectangle is:" + first.perimeter());
    }
}

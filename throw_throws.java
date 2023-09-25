package Com.Company;
import java.util.Scanner;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Negative Radius is not allowed";
    }
}

public class throw_throws {

    public static int divide(int a, int b) throws ArithmeticException{
        int result  = a/b;
        return result;
    }

    public static double radius(double r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        try{
//            System.out.println(divide(a,b));
//        }
//        catch (Exception e){
//            System.out.println("Exception");
//        }
        double a = sc.nextDouble();
        try {
            System.out.println(radius(a));
        }
        catch (NegativeRadiusException e){
            System.out.println("Negative Radius is not allowed");
        }
    }
}

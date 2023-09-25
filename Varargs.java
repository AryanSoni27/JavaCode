package Com.Company;

public class Varargs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

    static int sum(int x,int ...ar){
        int result = x;
        for(int a: ar){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 3 & 4 is: "+sum(3,4));
        System.out.println("The sum of 3 & 4 & 5 is: "+sum(3,4,5));
        System.out.println("The sum of 3 & 4 & 5 & 6 is: "+sum(3,4,5,6));
        System.out.println("The sum of 3 & 4 & 5 & 6 is: "+sum(100,100));
        System.out.println("The sum of 3 & 4 & 5 & 6 is: "+sum(5));
    }
}

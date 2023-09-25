package Com.Company;

public class Practice_Methods {

    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }

    static int sumrec(int n){
        if(n==1){
            return 1;
        }
        return n+sumrec(n-1);
    }

    static int fib(int n){
        if(n==1)
            return 0;
        else if (n==2) {
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        //Problem 1
        //Print table of number
        //multiplication(7);

        //Problem 2
        //Sum of n numbers using recursion
        //int a = sumrec(4);
        //System.out.println(a);

        //Problem 3
        //Fibonacci Series Question
        //Fibonacci Series -> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        //int a = fib(7);
        //System.out.println(a);
    }
}

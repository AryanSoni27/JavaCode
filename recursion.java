package Com.Company;

public class recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int result = 1;
            for(int i=1;i<=n;i++){
                result *= i;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        int a = 0;
        System.out.printf("The value of factorial of %d is: "+factorial(a),a);
        System.out.printf("\nThe value of factorial of %d is: "+factorial_iterative(a),a);
    }
}

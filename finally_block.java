package Com.Company;

public class finally_block {
    public static int greet(){
        try {
            int a = 10;
            int b = 5;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
       finally {
            System.out.println("This is the end of the function");
        }
        return 0;
    }
    public static void main(String[] args) {
        int f = greet();
        System.out.println(f);
        int a = 10;
        int b = 5;
        while (true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("The value of b = "+b);
            }
            b--;
        }
    }
}

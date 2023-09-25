package Com.Company;

public class try_catch {
    public static void main(String[] args) {
        int a = 9000;
        int b = 0;

        try {
            int c = a/b;
            System.out.println("The result is "+c);
        }
        catch (Exception e){
            System.out.println("We failed to divide the number because "+e);
        }
    }
}

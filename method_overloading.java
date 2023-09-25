package Com.Company;

public class method_overloading {
    static void arr(){
        System.out.println("Good Morning Bro!");
    }

    static void arr(int a){
        System.out.println("Good Morning "+a+" Bro!");
    }

    static void arr(int a, int b){
        System.out.println("Good Morning "+a+" Bro!");
        System.out.println("Good Morning "+b+" Bro!");
    }

    static void joke(){
        System.out.println(" Look at that.");
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int[] arr){
        arr[0] = 99;
    }

    public static void main(String[] args) {
        // joke();
        // Changing an integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after change is:"+x);
        // int [] marks = {98, 94, 95, 96, 68};
        // change2(marks);
        // System.out.println("The value of x after change is:"+marks[0]);
        arr();
        arr(100);
        arr(200,500);
    }
}

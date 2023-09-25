package Com.Company;

import java.util.Scanner;
public class else_if {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        
        if (age>50){
            System.out.println("You are experienced");
        }

        else if(age>40){
            System.out.println("You are semi-experienced");
        }

        else if(age>30){
            System.out.println("You are less experienced");
        }

        else{
            System.out.println("You are not experienced");
        }
    }
}

package Com.Company;
import java.util.Scanner;

public class errors {
    public static void main(String[] args) {
        //Syntax Error Demo
        //int a = 8 --> Error:-No semicolon
        //b = 5 --> Error:-No declaration type

        //Logical Error Demo
        //Logical Error means you don't get the desired output
        //Write a program to print prime numbers up to 10
//        System.out.println(2);
//        for(int i = 1;i<5;i++){
//            System.out.println(2*i+1);
//        }

        //Runtime Error Demo
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Integer part of a divided by 1000 is "+ 1000/a);
    }
}

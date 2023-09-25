package Com.Company;

import java.util.Arrays;
import java.util.Scanner;
public class practice_set {
    public static void main(String[] args) {
//        Question 1
//        int a=10;
//        if(a=11)
//            System.out.println("I am 11");
//        else
//            System.out.println("I am not 11");

//        Question 2
//        byte m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your marks in Physics");
//        m1=sc.nextByte();
//        System.out.println("Enter Your marks in Chemistry");
//        m2=sc.nextByte();
//        System.out.println("Enter Your marks in Mathematics");
//        m3=sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your overall percentage is:" + avg);
//        if(avg>40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, you have passed the exam");
//        }
//        else{
//            System.out.println("Sorry, you have not cleared exam");
//        }

//        Question 3
//        Scanner sc=new Scanner(System.in);
//        float tax = 0;
//        float income;
//        System.out.println("Enter your income: ");
//        income=sc.nextFloat();
//        if(income<=2.5){
//            tax=tax+0;
//        }
//        else if(income>2.5f && income<=5.0f){
//            tax = tax + 0.05f * (income-2.5f);
//        }
//        else if(income>5.0f && income<=10.0f){
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.2f * (income-5.0f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.2f * (10.0f-5.0f);
//            tax = tax + 0.3f * (income-10.0f);
//        }
//        System.out.println("Total tax paid is:"+tax);

//        Question 4
//        Scanner sc = new Scanner(System.in);
//        int a;
//        System.out.println("Enter number:");
//        a=sc.nextInt();
//        switch (a){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Enter number between 1 to 7");

//        Question 5
//        Scanner sc = new Scanner(System.in);
//        int year;
//        System.out.println("Enter Year:");
//        year = sc.nextInt();
//        if((year%4==0 && year%100!=0) || (year%100==0 && year%400==0)){
//            System.out.println("This is leap year");
//        }
//        else {
//            System.out.println("This is not leap year");
//        }
        int marks[][] ={{98,97,96},{95,94,93}};
        System.out.println(marks[0][2]);
        System.out.println();
    }
}

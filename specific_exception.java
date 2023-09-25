package Com.Company;

import java.util.Scanner;

public class specific_exception {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 8;
        marks[1] = 9;
        marks[2] = 7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index:");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide:");
        int number = sc.nextInt();
        try{
            System.out.println("Marks at index is:"+marks[ind]);
            System.out.println("Marks divide by number:"+marks[ind]/number);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry! There is some array exception");
            System.out.println(e);
        }

        catch (ArithmeticException e){
            System.out.println("Sorry! There is Arithmetic Exception");
            System.out.println(e);
        }

        catch (Exception e){
            System.out.println("Sorry! There is Exception");
            System.out.println(e);
        }
    }
}

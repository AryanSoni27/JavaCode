package Com.Company;

import java.util.Scanner;

public class Nested_Try {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 8;
        marks[1] = 8;
        marks[2] = 8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The index of array");
        int ind = sc.nextInt();
        try {
            System.out.println("Hey Welcome");
            try {
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry! Index is greater than array");
                System.out.println("Exception in level 2");
            }
        }
        catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
}

package Com.Aryan;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
//
//        switch (fruit){
//            case "mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("Red colored fruit");
//            case "watermelon" -> System.out.println("Green colored fruit");
//            default -> System.out.println("Please enter valid fruit name");
//        }
        int a = sc.nextInt();
        switch (a){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Please enter a number of day");
        }
    }
}

package Com.Aryan;

import java.util.Scanner;

public class Recorrunces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int a = sc.nextInt();

        while (a>0){
            int rem = a%10;
            if(rem == 8){
                count++;
            }
            a = a/10;
        }
        System.out.println(count);
    }
}

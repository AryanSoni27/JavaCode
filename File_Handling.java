package Com.Aryan;

import java.io.*;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {
//        File myFile = new File("Aryan.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            FileWriter myFile = new FileWriter("Aryan.txt");
//            myFile.write("Hey! This is new File.\n");
//            myFile.write("This is the second line of new file");
//            myFile.close();
//            System.out.println("Inserted Successfully");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            FileReader myFile = new FileReader("Aryan.txt");
//            Scanner sc = new Scanner(myFile);
//            while (sc.hasNextLine()){
//                System.out.println(sc.nextLine());
//            }
//            sc.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        File myfile = new File("Aryan.txt");
        myfile.delete();

    }
}

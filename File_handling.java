package Com.Company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_handling {
    public static void main(String[] args) {
        //Code to create a new file
        /*
        File myFile = new File("Aryan.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Code to write a file
        try {
            FileWriter myFileWriter = new FileWriter("Aryan.txt");
            myFileWriter.write("This is new text file\nThis is new line");
            myFileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Code to read a file
        File myFile = new File("Aryan.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        */

        //Deleting a file
        File myFile = new File("Aryan.txt");
        if(myFile.delete()){
            System.out.println("I have deleted:"+myFile.getName());
        }
        else{
            System.out.println("File is not deleted");
        }
    }
}

package Com.Aryan;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class csv1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("G:\\Study Material\\sample.csv"));
//            in.useDelimiter(",");
            while (in.hasNext()){
                System.out.println(in.next());
            }
            in.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

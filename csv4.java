package Com.Aryan;
import java.io.*;

import com.opencsv.CSVReader;

public class csv4 {
    public static void main(String[] args) {
        //In this program we are reading data from csv file using csvreader
        try {
            CSVReader read = new CSVReader(new FileReader("G:\\Python Practice Programs\\Marks_1.csv"));

            //
            StringBuffer buffer = new StringBuffer();
            String data[];

            while ((data = read.readNext()) != null){
                for (int i=0;i<data.length;i++){
                    System.out.print(data[i] + " ");
                }
                System.out.println();
            }
            read.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}

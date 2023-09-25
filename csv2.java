package Com.Aryan;

import com.opencsv.CSVWriter;

import java.io.FileWriter;

public class csv2 {
    public static void main(String[] args) {
        //In this program we are writing data in to csv file using program
        try {
            CSVWriter write = new CSVWriter(new FileWriter("G:\\Study Material\\sample.csv"));

            //Writing data in csv
            String row1[] = {"Name","Age","Gender","City"};
            String row2[] = {"Aryan","19","Male","Himatnagar"};
            String row3[] = {"Nishil","20","Male","Ahmedabad"};
            String row4[] = {"Shreya","19","Female","Anand"};
            String row5[] = {"Vidhi","18","Female","Ahmedabad"};

            //Setting data in csv file
            write.writeNext(row1);
            write.writeNext(row2);
            write.writeNext(row3);
            write.writeNext(row4);
            write.writeNext(row5);

            //Flush data to create csv file
            write.flush();

            System.out.println("Data entered successfully");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

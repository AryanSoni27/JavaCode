package Com.Aryan;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.util.ArrayList;

public class csv3 {
    public static void main(String[] args) {
        //In this program we are using .writeall method to insert data in csv file
        try {
            CSVWriter write = new CSVWriter(new FileWriter("G:\\Study Material\\sample2.csv"));

            String row1[] = {"Name","Id","Department"};
            String row2[] = {"Aryan","001","IT"};
            String row3[] = {"Nishil","002","Production"};
            String row4[] = {"Shubham","003","Delivery"};
            String row5[] = {"Raj","004","IT"};

            ArrayList list = new ArrayList();
            list.add(row1);
            list.add(row2);
            list.add(row3);
            list.add(row4);
            list.add(row5);

            write.writeAll(list);
            write.flush();
            System.out.println("Data Entered Successfully");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

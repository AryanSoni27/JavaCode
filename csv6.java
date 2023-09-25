package Com.Aryan;

import com.opencsv.stream.reader.LineReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.lang.Integer.parseInt;

public class csv6 {
    public static void main(String[] args) {
        //In this program we are inserting limited columns from csv files to database
        String url = "jdbc:mysql://localhost:3306/aryan";
        String user = "root";
        String password = "Aryan@1234";

        String filepath = "G:\\Python Practice Programs\\Marks_3.csv";
        int batchSize = 20;
        try {
            Connection con = DriverManager.getConnection(url,user,password);
            con.setAutoCommit(false);

            String query = "insert into marks1(name,marks) values(?,?)";

            PreparedStatement stmt = con.prepareStatement(query);

            BufferedReader reader = new BufferedReader(new FileReader(filepath));

            String lineText = null;
            int count = 0;

            reader.readLine();

            while ((lineText=reader.readLine())!=null){
                String[] data = lineText.split(",");

                String name = data[0];
                String marks = data[1];

                stmt.setString(1,name);
                stmt.setInt(2,parseInt(marks));
                stmt.addBatch();
                if(count%batchSize == 0){
                    stmt.executeBatch();
                }
            }
            reader.close();
            stmt.executeBatch();
            con.commit();
            con.close();
            System.out.println("Data has been inserted successfully");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


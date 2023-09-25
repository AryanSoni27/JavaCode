package Com.Aryan;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class db4 {
    public static void main(String[] args) {
        try {
            //In this program we are inserting image in database
            //Creating a Connection
            String url = "jdbc:mysql://localhost:3306/aryan";
            String user = "root";
            String password = "Aryan@1234";

            Connection con = DriverManager.getConnection(url,user,password);

            //Creating a Query
            String q = "insert into images2(pic) values(?)";

            PreparedStatement pstmt = con.prepareStatement(q);

            FileInputStream fis = new FileInputStream("G:\\PHOTOS\\Aryan\\20140413_213215.jpg");

            pstmt.setBinaryStream(1,fis,fis.available());

            pstmt.executeUpdate();
            System.out.println("Image is inserted");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}

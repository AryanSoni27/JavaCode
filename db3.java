package Com.Aryan;

import java.io.*;
import java.sql.*;


public class db3 {
    public static void main(String[] args) {
        try{
            //In this program we are trying to take input of values from the user
            //Creating a Connection
            String url = "jdbc:mysql://localhost:3306/aryan";
            String user = "root";
            String password = "Aryan@1234";

            Connection con = DriverManager.getConnection(url,user,password);

            //Creating a query
            String q = "insert into table1(tName,tCity) values(?,?)";

            //Get the prepared Statement
            PreparedStatement pstmt = con.prepareStatement(q);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            //Get the input from the user
            System.out.println("Enter Name: ");
            String name = br.readLine();

            System.out.println("Enter City: ");
            String city = br.readLine();

            //Set the values to the query
            pstmt.setString(1,name);
            pstmt.setString(2,city);

            pstmt.executeUpdate();

            System.out.println("Inserted");
            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

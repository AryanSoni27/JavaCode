package Com.Aryan;

import java.sql.*;

public class db {
    public static void main(String[] args) {
        try {
            //Creating a Connection
            String url = "jdbc:mysql://localhost:3306/aryan";
            String user = "root";
            String password = "Aryan@1234";
            Connection con = DriverManager.getConnection(url,user,password);
            if(con.isClosed()){
                System.out.println("Connection is closed");
            }
            else {
                System.out.println("Connection is created");
            }

            //Creating a Query
            String q = "create table table1(tID int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400))";

            //Create a Statement
            Statement stmt = con.createStatement();

            //Execute the statement
            stmt.executeUpdate(q);

            System.out.println("Table created");

            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
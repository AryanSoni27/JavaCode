package Com.Aryan;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class db2 {
    public static void main(String[] args) {
        try {
            //Creating a Connection
            String url = "jdbc:mysql://localhost:3306/aryan";
            String user = "root";
            String password = "Aryan@1234";

            Connection con = DriverManager.getConnection(url,user,password);

            if(con.isClosed()){
                System.out.println("Connection is not created");
            }
            else{
                System.out.println("Connection is created");
            }

            //Creating a Query
            String q = "insert into table1(tName,tCity) values(?,?)";

            //Get the prepared statement object
            PreparedStatement pstmt = con.prepareStatement(q);

            //Set the values to the query
            pstmt.setString(1,"Nishil");
            pstmt.setString(2,"Ahmedabad");

            pstmt.executeUpdate();

            System.out.println("Inserted");

            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

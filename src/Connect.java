import java.sql.*;
public class Connect {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacymanagement","root","admin12345");
            return con;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}

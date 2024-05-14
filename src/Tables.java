import javax.swing.*;
import java.sql.Connection;
import java.sql.Statement;

public class Tables {
    public static void main(String[] args) {
        try{
            Connection con = Connect.getCon();
            Statement st = con.createStatement();
            //st.executeUpdate("create table sys_user(sys_user_pk int AUTO_INCREMENT primary key,userrole varchar(200),name varchar(200)," +
                    //"DOB varchar(50),mobilenumber varchar(50),email varchar(200),username varchar(200),password varchar(50))");
            //st.executeUpdate("insert into sys_user(userrole,name,DOB,mobilenumber,email,username,password) " +
                    //"values ('Pharmacy Manager','Abdullah','20-03-2003','03355220910','abdullahclicks17@gmail.com','abdullahmad','Abdullah1020#')");
            //st.executeUpdate("create table medicine(medicine_PK int AUTO_INCREMENT primary key, uniqueId varchar(200), name varchar(200), companyName varchar(200), quantity bigint, price bigint, expiry varchar(50)); ");
            //st.executeUpdate("INSERT INTO medicine (uniqueId, name, companyName, quantity, price, expiry) VALUES ('100', 'Paracetamol', 'ABC Pharma', 150, 100, '30-06-2025');");
            //st.executeUpdate("create table bill (bill_pk int AUTO_INCREMENT primary key,billID varchar(200),billDate varchar(50), totalPaid bigint , GeneratedBY varchar(50))");
            JOptionPane.showMessageDialog(null,"Table Created Succesfully");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}

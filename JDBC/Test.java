package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "karan");
            Statement st= con.createStatement();
            String sql = "CREATE TABLE REGISTRATION " +"(id INTEGER not NULL, " +" first VARCHAR(255))"; 
            String sq2 = "INSERT into REGISTRATION values('16D','karan j')"; 

            st.executeUpdate(sql);
            st.executeUpdate(sq2);
            ResultSet rs=st.executeQuery("SELECT * FROM REGISTRATION");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

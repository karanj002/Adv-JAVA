package JDBC;

import javax.xml.transform.Result;
import java.net.ConnectException;
import java.sql.*;

class OracleCon {
    public static void main(String[] args) throws Exception {
        //Step 1 load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Step2 Create the connection object
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "karan");
        //Step3 Create the statement Object
        Statement stmt=con.createStatement();
        //Step4 Execute Statement
        Result rs= (Result) stmt.executeQuery("Select * from emp");
        con.close();
    }
}

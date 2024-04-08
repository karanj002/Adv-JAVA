package JDBC;

import javax.xml.transform.Result;
import java.sql.*;

class OracleCon1 {
    public static void main(String[] args) throws Exception {
        try {
            // Step 1 load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Step2 Create the connection object
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "karan");
            // Step3 Create the statement Object
            Statement stmt = con.createStatement();
                        //Creating a Table
            String sql = "Create table emp(ID int, Name varchar(40), age int(3))";
                    // PreparedStatement pstmt=con.prepareStatement(sql);
                    // pstmt.executeUpdate();

            // Step4 Execute Statement

            Result r = (Result) stmt.executeQuery("Select * from emp");
            stmt.executeUpdate(sql);
            con.commit();
            // Inserting data
            sql="select * from emp";
            stmt.executeQuery(sql);
            Employe e = new Employe();
            for (int i = 0; i < 1; i++) {
                e.input();
                String SQL = "Insert into emp values(?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(SQL);
                pstmt.setInt(1, e.id);
                pstmt.setString(2, e.name);
                pstmt.setInt(3, e.age);
                pstmt.executeUpdate();
                pstmt.close();
            }
            // Viewing data
            ResultSet rs =stmt.executeQuery("Select * from emp");
            while (rs.next()){
                e.id=rs.getInt(1);
                e.name=rs.getString(2);
                e.age=rs.getInt(3);
                e.display();
            }
            // Update the records in Data
            stmt.executeUpdate("Update emp"+ "set id="+3+" where name = naveen");
            //con.commit();

            // View data again
            ResultSet res =stmt.executeQuery("Select * from emp");
            while (rs.next()){
                e.id=rs.getInt(1);
                e.name=rs.getString(2);
                e.age=rs.getInt(3);
                e.display();
            }
            stmt.close();
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

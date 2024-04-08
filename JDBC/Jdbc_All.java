package JDBC;
import java.sql.*;

public class Jdbc_All {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "karan");
            Statement st = conn.createStatement();
            
            // Create (Insert)
            String sq = "CREATE TABLE NewMovie " +"(name VARCHAR(255), " +" gender VARCHAR(255), " +" seatNo VARCHAR(255) NOT NULL)";
            //st.executeUpdate(sq);

            String q1 = "INSERT into NewMovie values('KJ', 'Male', '19D')";
            System.out.println(st.executeUpdate(q1));
            //String q2 = "INSERT into NewMovie values('Bob', 'Male', '16D')";
            //System.out.println(st.executeUpdate(q2));
            //String q3 = "INSERT into NewMovie values('Charles', 'Male', '4C')";
            //System.out.println(st.executeUpdate(q3));
            //conn.commit();
            
            // Retreive (Select)
            String q4 = "SELECT * from NewMovie ";
            ResultSet rs = st.executeQuery(q4);
            
            int numCols = rs.getMetaData().getColumnCount();
            System.out.println("Column Count: " + numCols);
            
            for(int i = 0; i < numCols; i++) {
                System.out.println(rs.getMetaData().getColumnName(i + 1));
            }
            
            while(rs.next()) {
                System.out.println("Name: " + rs.getString("Name"));
                System.out.println("Gender: " + rs.getString("Gender"));
                System.out.println("Seat: " + rs.getString("seatNo"));
            }
            
            // Update
            //String q5 = "UPDATE NewMovie set seatNo=('23F') where Name=('Alice')";
            //st.executeUpdate(q5);
            
            // Delete
            //String q6 = "DELETE from NewMovie where Name=('Bob')";
            //st.executeUpdate(q6);
            
            /*
            // Batch Process
            st.addBatch("INSERT into NewMovie values('Bob', 'Male', '16D')");
            st.addBatch("DELETE from NewMovie where Name='Charles'");
            st.executeBatch();
            */
            
            /*
            // Prepared Statement
            String q7 = "DELETE from NewMovie where Name=(?)";
            PreparedStatement ps1 = conn.prepareStatement(q7);
            ps1.setString(1, "Alice");
            ps1.executeUpdate();
            */
            
            conn.close();
        } catch(SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Error performing operation: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
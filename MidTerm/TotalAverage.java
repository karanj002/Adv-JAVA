package MidTerm;
import javax.xml.transform.Result;
import java.sql.*;

public class TotalAverage {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "karan");
            Statement stmt = conn.createStatement();

            String sql = "CREATE table marks( Name varchar(40), sub1 int(5), sub2 int(5), sub3 int(5), sub4 int(5), sub5 int(5))";

            Result r = (Result) stmt.executeQuery("Select * from emp");
            stmt.executeUpdate(sql);
            conn.commit();

            // CREATE (INSERT)
            String q1 = ("INSERT into marks values('Alice', '10', '20', '30', '40', '50')");
            System.out.println(stmt.executeUpdate(q1));
            String q2 = ("INSERT into marks values('Bob', '20', '30', '40', '50', '60')");
            System.out.println(stmt.executeUpdate(q2));

            //stmt.addBatch("INSERT into marks values('Alice', '10', '20', '30', '40', '50')");
            //stmt.addBatch("INSERT into marks values('Bob', '20', '30', '40', '50', '60')");
            //stmt.executeBatch();

            //conn.commit();

            // RETRIEVE (SELECT)
            String q3 = "SELECT * from marks";
            ResultSet rs = stmt.executeQuery(q3);

            int numCols = rs.getMetaData().getColumnCount();
            System.out.println("Column Count: " + numCols);

            for(int i = 0; i < numCols; i++) {
                System.out.println(rs.getMetaData().getColumnName(i + 1));
            }

            while(rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Mark1: " + rs.getString("mark1"));
                System.out.println("Mark2: " + rs.getString("mark2"));
                System.out.println("Mark3: " + rs.getString("mark3"));
                System.out.println("Mark4: " + rs.getString("mark4"));
                System.out.println("Mark5: " + rs.getString("mark5"));

                int total = 0;
                for(int i = 1; i < numCols; i++) {
                    total += rs.getInt(i + 1);
                }
                System.out.println("Total: " + total);
                System.out.println("Average: " + total/5);
            }

            // DELETE
            String q4 = "DELETE from marks where name=('Alice')";
            stmt.executeUpdate(q4);
            String q5 = "DELETE from marks where name=('Bob')";
            stmt.executeUpdate(q5);

            //stmt.addBatch("DELETE from marks where name=('Alice')");
            //stmt.addBatch("DELETE from marks where name=('Bob')");
            //stmt.executeBatch();

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
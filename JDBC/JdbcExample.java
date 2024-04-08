package JDBC;
import java.sql.*;

public class JdbcExample {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "karan");
            Statement st = con.createStatement();
            String sql = "CREATE TABLE employee " +"(id INTEGER not NULL, " +" name VARCHAR(255), " +" salary DOUBLE not NULL)";
            //st.executeUpdate(sql);

            //String alterSql = "ALTER TABLE employee ADD COLUMN salary DOUBLE NOT NULL DEFAULT 0";
            //st.executeUpdate(alterSql);
            String q1 = "INSERT into employee values('298', 'Rana', '4700000')";
            System.out.println(st.executeUpdate(q1));
            //String q2 = "INSERT into employee values('123', 'Gotya', '8999999')";
            //System.out.println(st.executeUpdate(q2));
           // String q3 = "INSERT into employee values('918', 'ranjan', '230000000')";
            //System.out.println(st.executeUpdate(q3));
            

            ResultSet resultSet = st.executeQuery("SELECT * FROM employee");
            while (resultSet.next()) {
                System.out.println("Employee ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name")+ ", Salary: " + resultSet.getDouble("salary") + "\n");
            }
            resultSet.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


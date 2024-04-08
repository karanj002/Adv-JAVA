package JDBC;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class JdbcAWT extends Frame implements ActionListener {

    private Label label;
    private TextField idField;
    private TextField nameField;
    private TextArea textArea;
    private Button fetchButton;
    private Button insertButton;
    private Button deleteButton;

    public JdbcAWT() {
        setTitle("JDBC Connectivity Example");
        setSize(400, 300);

        label = new Label("Employee Details:");
        idField = new TextField("Enter ID");
        nameField = new TextField("Enter Name");
        textArea = new TextArea("Employee List:");
        fetchButton = new Button("Fetch Data");
        insertButton = new Button("Insert Data");
        deleteButton = new Button("Delete Data");

        fetchButton.addActionListener(this);
        insertButton.addActionListener(this);
        deleteButton.addActionListener(this);

        Panel inputPanel = new Panel();
        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.add(new Label("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new Label("Name:"));
        inputPanel.add(nameField);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(1, 3));
        buttonPanel.add(fetchButton);
        buttonPanel.add(insertButton);
        buttonPanel.add(deleteButton);

        setLayout(new BorderLayout());
        add(label, BorderLayout.NORTH);
        add(inputPanel, BorderLayout.CENTER);
        add(textArea, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JdbcAWT();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "root";
            String password = "karan";
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            if (e.getSource() == fetchButton) {
                resultSet = statement.executeQuery("SELECT * FROM employee");
                textArea.setText("Employee List:\n");
                while (resultSet.next()) {
                    textArea.append("ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name")  + "\n");
                }
            } else if (e.getSource() == insertButton) {
                try {
                    int id = Integer.parseInt(idField.getText());
                    String name = nameField.getText();
                    statement.executeUpdate("INSERT INTO employee VALUES (" + id + ", '" + name + "')");
                    textArea.setText("Data Inserted Successfully!");
                } catch (NumberFormatException ex) {
                    textArea.setText("Invalid ID format. Please enter a valid integer ID.");
                }
            } else if (e.getSource() == deleteButton) {
                try {
                    int id = Integer.parseInt(idField.getText());
                    statement.executeUpdate("DELETE FROM employee WHERE id = " + id);
                    textArea.setText("Data Deleted Successfully!");
                } catch (NumberFormatException ex) {
                    textArea.setText("Invalid ID format. Please enter a valid integer ID.");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Closing resources in the finally block
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
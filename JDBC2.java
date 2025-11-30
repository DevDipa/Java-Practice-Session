import java.sql.*;

public class JDBC2 {

    static Connection conn;
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_sample", "root", "");

            Statement smt = conn.createStatement();

            String readQuery = "SELECT * FROM employee";

            ResultSet rs = smt.executeQuery(readQuery);
            while(rs.next()) {
                System.out.println("Id: " + rs.getInt("id") + " Name: " + rs.getString("name") + " Salary: " + rs.getFloat("salary"));
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

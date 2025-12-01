import java.sql.*;
import java.util.*;

public class PreparedSmt {

    public static Connection conn;
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_sample", "root", "");

            Scanner obj = new Scanner(System.in);
            System.out.print("Enter your username:");
            String user = obj.nextLine();
            System.out.print("Enter your password:");
            String pass = obj.nextLine();

            /*This causes SQL Injection!!!
            Statement smt = conn.createStatement();
            String readQuery = "SELECT name, salary from employee WHERE username = '" + user + "' and password = '" + pass + "'";

            ResultSet rs = smt.executeQuery(readQuery);
            while(rs.next()) {
                System.out.println("Name = " + rs.getString("name") + " Salary = " + rs.getFloat("salary"));
            } */

            String readQuery = "SELECT name, salary FROM employee WHERE username = ? and password = ?";
            PreparedStatement psmt = conn.prepareStatement(readQuery);
            psmt.setString(1, user);
            psmt.setString(2, pass);

            ResultSet rs = psmt.executeQuery();
            while(rs.next()) {
                System.out.println("Name = " + rs.getString("name") + " Salary = " + rs.getFloat("salary"));
            }

            obj.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

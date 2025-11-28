import java.sql.*;
import java.util.*;

public class JDBC {

    //Since main() is static, it can't access a non-static data member i.e. conn. Thus, keeping it outside.
    static Connection conn;
    public static void main(String[] args) {
        try{
            //STEP 1: Register driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //STEP 2: Create connection object
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");

            //STEP 3: Create statement
            Statement smt = conn.createStatement();

            //STEP 4: Write SQL query and execute it
            String createDbQuery = "CREATE DATABASE java_sample";
            smt.executeUpdate(createDbQuery);

            String useDbQuery = "USE java_sample";
            smt.executeUpdate(useDbQuery);

            String createTableQuery = "CREATE TABLE employee(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(30) NOT NULL, salary DECIMAL(10,2) )";
            smt.executeUpdate(createTableQuery);

            //asking the user for values
            Scanner obj = new Scanner(System.in);
            System.out.print("How many employees are there? - ");
            int num = obj.nextInt();
            obj.nextLine();

            for(int i = 0; i < num; i++) {
                System.out.println("For employee no. " + (i+1) + ":");
                System.out.print("Enter name:");
                String name = obj.nextLine();
                System.out.print("Enter salary:");
                float salary = Float.parseFloat(obj.nextLine());
                System.out.println("**************************************************");

                String insertQuery = "INSERT INTO employee(name, salary) VALUES('" + name + "'," + salary + ")";
                smt.executeUpdate(insertQuery);
            }

            System.out.println("OPERATION SUCCESSFUL:)");
            obj.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

import java.io.*;
import java.util.*;

public class ObjSerialization {
    public static void main(String[] args) throws IOException {
        //better to keep .ser extension for serialized files
        FileOutputStream fos = new FileOutputStream("ObjSerialization.ser", true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Scanner obj = new Scanner(System.in);
        System.out.print("How many employees are there? - ");
        int num = obj.nextInt();
        //to consume the buffer
        obj.nextLine();

        //creating an array of Employee objects
        Employee[] e = new Employee[num];
        
        for(int i = 0; i < num; i++) {
            System.out.print("For Employee No." + (i+1) + ":\n");
            e[i] = new Employee();
            e[i].id = i+1;
            System.out.print("Enter name:");
            String name = obj.nextLine();
            e[i].name = name;
            System.out.print("Enter salary:");
            float salary = Float.parseFloat(obj.nextLine());
            e[i].salary = salary; 

            // write each employee object to the stream
            oos.writeObject(e[i]);
        }
        obj.close();
        oos.close();
    }
}

//the class whose objects have to be written to the file must implement the interface Serializable
class Employee implements Serializable{
    public int id;
    public String name;
    public float salary;
}

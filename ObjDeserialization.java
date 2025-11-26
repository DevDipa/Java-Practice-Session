import java.io.*;

public class ObjDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("ObjSerialization.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        System.out.println("FILE CONTENT:");

            boolean done = false;
            while(!done) {
                try {
                    Employee e = (Employee)ois.readObject();
                    System.out.println("Id: " + e.id + " Name: " + e.name + " Salary: " + e.salary);
                } catch (EOFException eof) {
                    // reached end of file
                    done = true;
                }
            }

        ois.close();
    }
    
}

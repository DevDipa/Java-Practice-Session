import java.io.*;
import java.util.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the content of a file:");
        String str = obj.nextLine();

        //we gotta convert the String into bytes cause the content gets stored as bytes in the file
        byte[] b = str.getBytes();

        //writing to a file
        FileOutputStream fos = new FileOutputStream("FileIO.txt");
        fos.write(b);
        fos.close();
        obj.close();

        //reading from the file
        FileInputStream fis = new FileInputStream("FileIO.txt");
        //each character is retrieved as an integer
        System.out.println("The retrieved content of the file:");
        int x;
        while((x = fis.read()) != -1) {
            //the integer is expressed as character
            System.out.print((char)x);
        }
    }
}

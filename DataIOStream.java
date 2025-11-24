import java.io.*;

public class DataIOStream {
    public static void main(String[] args) throws IOException {
        //alternative to the Scanner class - InputStreamReader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter an integer:");
        int x = Integer.parseInt(br.readLine());
        System.out.print("Enter a string:");
        String str = br.readLine();
        System.out.print("Enter a float:");
        float f = Float.parseFloat(br.readLine());

        //writing to a file
        FileOutputStream fos = new FileOutputStream("DataIOStream.txt");
        DataOutputStream dos =  new DataOutputStream(fos);

        dos.writeInt(x);
        dos.writeUTF(str);
        dos.writeFloat(f);

        dos.close();
        fos.close();

        //reading from the file
        FileInputStream fis = new FileInputStream("DataIOStream.txt");
        DataInputStream dis = new DataInputStream(fis);

        //the read order must match with the write order - here, int - String - float
        int num = dis.readInt();
        String s = dis.readUTF();
        float fl = dis.readFloat();
        
        System.out.println("CONTENTS IN THE FILE:\n" + num + "\n" + s + "\n" + fl + "\n");
        fis.close();
        dis.close();
    }
}

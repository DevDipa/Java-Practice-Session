import java.io.*;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        //using an alternative to Scanner class for input
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter an integer:");
        int x = Integer.parseInt(br.readLine());
        System.out.print("Enter a string:");
        String str = br.readLine();
        System.out.print("Enter a float:");
        float f = Float.parseFloat(br.readLine());

        //we can use FileWriter class here, but for the sake of formatted output, I'm using PrintWriter
        PrintWriter pw = new PrintWriter("CharStream.txt");
        pw.printf("Integer:%d \n String:%s \n Float:%.2f", x, str, f);

        //IMP!!! flush() is imp cause pw writes into a buffer, so unless you flush it, you won't reach the disk
        pw.flush();

        //displaying the file content using FileReader
        FileReader fr = new FileReader("CharStream.txt");
        System.out.println("FILE CONTENT:");
        int y;
        while((y=fr.read()) != -1) {
            System.out.print((char)y);
        }

        pw.close();
        fr.close();
    }
}

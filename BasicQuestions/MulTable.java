package BasicQuestions;
import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table:");
        int x = in.nextInt();

        for (int i  = 1; i <= 10; i++) {
            int mul = x * i;
            System.out.println(x + " x " + i + " = " + mul);
        }
        in.close();
    }
}

package BasicQuestions;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter any 3 numbers of your choice:");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();

        // Nested ternary to find largest
        int largest = (num1 > num2 && num1 > num3) 
                        ? num1 
                        : (num2 > num1 && num2 > num3) 
                            ? num2 
                            : num3;

        System.out.println("The largest number is: " + largest);

        obj.close();
    }
}
